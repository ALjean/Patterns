package com.jean.rrs.factory;

import com.jean.rrs.constant.ChannelEnums;
import com.jean.rrs.constant.NewsEnums;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBuilder {

    public static Map<String, List<String>> buildNewsMap(){
        Map<String, List<String>> mapNodes = new HashMap<>();
        for (NewsEnums nodeEnum : NewsEnums.values()) {
            mapNodes.put(nodeEnum.name(), new ArrayList<>());
        }

        return mapNodes;
    }

    public static Map<String, String> buildChannelMap(){
        Map<String, String> mapNodes = new HashMap<>();
        for (ChannelEnums nodeEnum : ChannelEnums.values()) {
            mapNodes.put(nodeEnum.name(), null);
        }
        return mapNodes;
    }
}
