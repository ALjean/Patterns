package com.jean.rrs.parser;


import com.jean.rrs.factory.DataBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class XmlRssNews {

    private static final String ITEM = "item";


    private Document document;
    private List<Map<String, List<String>>> news;


    public XmlRssNews(Document document) {
        this.document = document;
        this.news = new ArrayList<>();
    }


    public void parse() {
        NodeList list = document.getElementsByTagName(ITEM);
        parseNews(list);
    }

    private void parseNews(NodeList nodes) {
        int size = nodes.getLength();
        for (int i = 0; i < size; i++) {
            Map<String, List<String>> mapNewsNodes = DataBuilder.buildNewsMap();

            Node nodeNews = nodes.item(i);
            for (int j = 0; j < nodeNews.getChildNodes().getLength(); j++) {
                putData(nodeNews.getChildNodes().item(j), mapNewsNodes);
            }

            news.add(mapNewsNodes);

        }
    }


    private void putData(Node node, Map<String, List<String>> mapNewsNodes) {
        String nodeName = node.getNodeName();
        String nodeContent = node.getTextContent();

        if (mapNewsNodes.containsKey(nodeName)) {
            mapNewsNodes.get(nodeName).add(nodeContent);
        }
    }

    public List<Map<String, List<String>>> getNews() {
        return news;
    }

}
