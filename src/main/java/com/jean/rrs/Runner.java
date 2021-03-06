package com.jean.rrs;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;


public class Runner {

    public static void main(String... args) throws ParserConfigurationException, SAXException {
        String host = "https://habrahabr.ru/rss/feed/posts/ba44b23933304eeeb1414a116c0b0946";

        ReadFeed readFeed = new ReadFeed();
        readFeed.buildUrl(host);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try(InputStream stream = readFeed.getStream()){

            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(stream);

            RssImpl rssImpl = new RssImpl(document); //TODO set DOC ?
            rssImpl.parseRssDocument();
            rssImpl.createChannel();

//            XmlRssNews parser = new XmlRssNews(document);
//            XmlRssChannel parserchanal = new XmlRssChannel(document);
//            parserchanal.parse();
//            parser.parse();


        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
