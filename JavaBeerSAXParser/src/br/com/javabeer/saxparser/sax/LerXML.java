package br.com.javabeer.saxparser.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import br.com.javabeer.saxparser.entity.Cao;

public class LerXML extends DefaultHandler {
	
	//Lista para carregar os Objetos
	private List<Cao> caes = null;
	private Cao cao = null;

	public List<Cao> getCaes() {
		return caes;
	}

	boolean bRaca;
	boolean bPorte;
	boolean bIdade;
	boolean bNome;

	@Override
	public void startElement(String uri, String caminho, String qNome, Attributes atributos)
			throws SAXException {
		if (qNome.equalsIgnoreCase("Cao")) {
			String id = atributos.getValue("id");
			cao = new Cao();
			cao.setId(Integer.parseInt(id));
			
			if (caes == null) {caes = new ArrayList<>();}
		
		} else if (qNome.equalsIgnoreCase("raca")) {
			//Setar os valores boolean como true para usado para configurar as variaveis de Cao
			bRaca = true;
		} else if (qNome.equalsIgnoreCase("porte")) {
			bPorte = true;
		} else if (qNome.equalsIgnoreCase("idade")) {
			bIdade = true;
		} else if (qNome.equalsIgnoreCase("nome")) {
			bNome = true;
		}
	}
	
	@Override
	public void endElement(String uri, String caminho, String qNome) throws SAXException {
        if (qNome.equalsIgnoreCase("Cao")) {
            //Adicionar o objeto na lista
            caes.add(cao);
        }
    }
	
	 @Override
	    public void characters(char ch[], int start, int length) throws SAXException {
	 
	        if (bRaca) {
	            //age element, set Employee age
	            cao.setRaca(new String(ch, start, length));
	            bRaca = false;
	        } else if (bNome) {
	            cao.setNome(new String(ch, start, length));
	            bNome = false;
	        } else if (bPorte) {
	            cao.setPorte(new String(ch, start, length));
	            bPorte = false;
	        } else if (bIdade) {
	            cao.setIdade(Integer.parseInt(new String(ch, start, length)));
	            bIdade = false;
	        }
	    }

}
