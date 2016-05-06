package com.jean.rrs;

import com.jean.rrs.factory.ModelBuilder;
import com.jean.rrs.model.Channel;
import com.jean.rrs.parser.XmlRssChannel;
import com.jean.rrs.parser.XmlRssNews;
import org.w3c.dom.Document;

public class Rss {

    private XmlRssChannel xmlRssChannel;
    private XmlRssNews xmlRssNews;


    public Rss(Document document){
        this.xmlRssChannel = new XmlRssChannel(document);
        this.xmlRssNews = new XmlRssNews(document);
    }

    public void parseRssDocument(){
        this.xmlRssChannel.parse();  //need use pattern
        this.xmlRssNews.parse();
    }

    public void createChannel(){
        Channel channel = new Channel();

        ModelBuilder.buildModel(channel, this.xmlRssChannel.getChannel(), this.xmlRssNews.getNews());

    }
}
