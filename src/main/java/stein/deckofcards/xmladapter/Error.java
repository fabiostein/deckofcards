package stein.deckofcards.xmladapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Deck")
@XmlAccessorType(XmlAccessType.FIELD)
public class Error {
	private String message = null;
	
	public Error(String message) {
		this.message = message;
	}
	public Error() {
		
		
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

	

}
