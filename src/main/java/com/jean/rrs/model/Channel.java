package com.jean.rrs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Channel {

    private String title;
    private String link;
    private String description;
    private String language;
    private String managingEditor;
    private  String generator;
    private Date pubDate;
    private Logo logo; //image
    private List<Item> listNews;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getManagingEditor() {
        return managingEditor;
    }

    public void setManagingEditor(String managingEditor) {
        this.managingEditor = managingEditor;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public List<Item> getListNews() {
        return listNews;
    }

    public void setListNews(List<Item> listNews) {
        this.listNews = listNews;
    }
}
