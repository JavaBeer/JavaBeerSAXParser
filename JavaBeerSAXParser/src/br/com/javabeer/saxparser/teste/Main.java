package br.com.javabeer.saxparser.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import br.com.javabeer.saxparser.entity.Cao;
import br.com.javabeer.saxparser.sax.LerXML;

public class Main {

	public static void main(String[] args) {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		try {
			InputStream    xmlInput  =
			        new FileInputStream("/CAMINHO/DO/XML");
			SAXParser saxParser = saxParserFactory.newSAXParser();	
			LerXML handler = new LerXML();
			saxParser.parse(xmlInput, handler);
			List<Cao> caes = handler.getCaes();
			for (Cao cao : caes) {
				System.out.println(cao);
			}
		} catch (ParserConfigurationException | SAXException | IOException  e) {
	        e.printStackTrace();
		}
	}

}
