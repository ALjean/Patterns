package com.jean.rrs.parser;


import com.jean.rrs.factory.DataBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Map;

public class XmlRssChannel {

    private static final String CHANNEL = "channel";

    private Document document;
    private Map<String, String> channel;

    public XmlRssChannel(Document document) {
        this.document = document;
        this.channel = DataBuilder.buildChannelMap();
    }

    public void parse() {
        NodeList list = document.getElementsByTagName(CHANNEL);
        parseChannel(list);
    }

    private void parseChannel(NodeList nodes) {
        NodeList channelChildNodes = nodes.item(0).getChildNodes(); //only one channel;
        int size = channelChildNodes.getLength();

        for (int i = 0; i < size; i++) {
            putData(channelChildNodes.item(i));
        }
    }

    private void putData(Node node) {
        String nodeName = node.getNodeName();
        String nodeContent = node.getTextContent();

        if (this.channel.containsKey(nodeName)) {
            this.channel.put(nodeName, nodeContent);
        }
    }

    public Map<String, String> getChannel() {
        return channel;
    }
}
