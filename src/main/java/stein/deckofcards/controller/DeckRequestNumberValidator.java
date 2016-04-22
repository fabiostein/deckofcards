package stein.deckofcards.controller;

public class DeckRequestNumberValidator {
	public void validate(int requestedNumber){
		if(requestedNumber < 0){
			throw new RuntimeException("The requested number cannot be less than 0");
		}
		if(requestedNumber > 54){
			throw new RuntimeException("The requested number cannot be greater than 54");
		}
	}
}
