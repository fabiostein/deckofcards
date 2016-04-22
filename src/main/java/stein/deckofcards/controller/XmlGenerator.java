package stein.deckofcards.controller;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XmlGenerator{

	public String marshall(Class<?> clazz, Object object){
		String result = null;
		try{
			JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] { clazz});
			StringWriter outWriter = new StringWriter();
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(object, outWriter);
			result = outWriter.toString();
		}catch(Throwable t){
			t.printStackTrace();
			result = "<xml>Impossible to generator the XML file: " + t.getMessage() + "</xml>"; 
		}
		return result;

	}

}
