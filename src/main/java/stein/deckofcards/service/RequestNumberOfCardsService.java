// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RequestNumberOfCardsService.java

package stein.deckofcards.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import stein.deckofcards.controller.DeckCreator;
import stein.deckofcards.controller.DeckCreatorStandardCardsWithJokers;
import stein.deckofcards.controller.DeckPartitioner;
import stein.deckofcards.controller.DeckRequestNumberValidator;
import stein.deckofcards.controller.DeckShuffler;
import stein.deckofcards.controller.XmlGenerator;
import stein.deckofcards.model.Deck;

@Path("/cards")
public class RequestNumberOfCardsService {

	
	private String handleError(Exception e){
			stein.deckofcards.xmladapter.Error error = new stein.deckofcards.xmladapter.Error(e.getMessage());
			XmlGenerator xmlGenerator = new XmlGenerator();
			return xmlGenerator.marshall(error.getClass(), error);
	}
	
	@GET
	@Path("/{numberOfCards}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public String request(@PathParam("numberOfCards") Integer numberOfCards) {
		DeckRequestNumberValidator validator = new DeckRequestNumberValidator();
		
		try{
			validator.validate(numberOfCards);
		}catch(Exception e){
			return handleError(e);
		}
		
		
		DeckCreator deckCreator = new DeckCreatorStandardCardsWithJokers();
		Deck deck = deckCreator.create();
		DeckShuffler suffler = new DeckShuffler();
		suffler.shuffle(deck);
		DeckPartitioner particioner = new DeckPartitioner();
		List<Deck> decks = particioner.partition(deck, numberOfCards);

		XmlGenerator xmlGenerator = new XmlGenerator();
		return xmlGenerator.marshall(Deck.class, decks.get(0));


	}
}
