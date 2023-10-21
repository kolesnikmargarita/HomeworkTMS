package Homework18.MainTask;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SAXParse extends DefaultHandler {

    private final StringBuilder fileName = new StringBuilder();
    private final StringBuilder text = new StringBuilder();
    private boolean writeText = false;

    private String firstName;
    private boolean writeFirstName;
    private String lastName;
    private boolean writeLastName;
    private String title;
    private boolean writeTitle;

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        switch (qName) {
            case "firstName" -> writeFirstName = true;
            case "lastName" -> writeLastName = true;
            case "title" -> writeTitle = true;
            case "line" -> writeText = true;
        }/*
        if(qName.equals("") || qName.equals("lastName") || qName.equals("title")) {

            writeFileName = true;
        } else if(qName.equals("line")) {
            writeText = true;
        }*/
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException  {
        if(writeFirstName){
            firstName = new String(ch, start, length);
            writeFirstName = false;
        } else if(writeLastName) {
            lastName = new String(ch, start, length);
            writeLastName = false;
        } else if(writeTitle) {
            title = new String(ch, start, length);
            writeTitle = false;
        } else if(writeText) {
            text.append(new String(ch, start, length)).append("\n");
            writeText = false;
        }
    }

    public StringBuilder getFileName() {
        return fileName.append(firstName).append("_").append(lastName).append("_").append(title).append(".txt");
    }

    public StringBuilder getText() {
        return text;
    }
}
