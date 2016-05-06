package com.jean.rrs.factory;

import com.jean.rrs.constant.ChannelEnums;
import com.jean.rrs.constant.NewsEnums;
import com.jean.rrs.model.Channel;
import com.jean.rrs.model.Item;

import java.util.List;
import java.util.Map;

public class ModelBuilder {

    public static void buildModel(Channel channel, Map<String, String> channelData, List<Map<String, List<String>>> newsData){
        buildModel(channel, channelData);
        buildModel(channel, newsData);
    }

    private static void buildModel(Channel channel, Map<String, String> channelData){
        channel.setTitle(channelData.get(ChannelEnums.title.name()));
        channel.setLink(channelData.get(ChannelEnums.link.name()));
        channel.setLanguage(channelData.get(ChannelEnums.language.name()));
        channel.setManagingEditor(channelData.get(ChannelEnums.managingEditor.name()));
        channel.setGenerator(channelData.get(ChannelEnums.generator.name()));
//        channel.setPubDate(channelData.get(ChannelEnums.pu.name()));
        channel.setDescription(channelData.get(ChannelEnums.description.name()));


    }

    private static void buildModel(Channel channel, List<Map<String, List<String>>> newsData){


        newsData.stream().forEach(map -> {
            createItem(map);
        });

    }

    private static Item createItem(Map<String, List<String>> mapNews){
        Item itemNews = new Item();

        List list = mapNews.get(NewsEnums.category.name());

        //One field data only
        if(list.size() == 1){

        }

        list.forEach(item ->{

        });
//        item.setCategory();

        return null;
    }
}
