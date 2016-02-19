package com.jean.lambda.function;


import com.jean.lambda.function.factory.AlbumBuilder;
import com.jean.lambda.function.factory.TrackBuilder;
import com.jean.lambda.function.model.Album;
import com.jean.lambda.function.model.Track;
import com.jean.lambda.function.service.AlbumService;
import com.jean.lambda.function.service.impl.AlbumServiceJava7Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String ... args){
        // sum all number
//        CustomFunction customFunction = stream -> stream.reduce((a, b) -> a + b).get();
//
//        List<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(34);
//        list.add(41);
//        list.add(51);
//        list.add(21);
//        int sum = customFunction.sum(list.stream());
//        System.out.println(sum);


        AlbumBuilder albumBuilder = new AlbumBuilder();
        List<Album> albumList = albumBuilder.buildAlbums(10, 5);

        AlbumService albumService = new AlbumServiceJava7Impl();
        Set<String> tracks = albumService.findLongTracks(albumList);


        System.out.println(tracks);



    }
}
