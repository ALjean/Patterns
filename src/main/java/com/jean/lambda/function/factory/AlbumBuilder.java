package com.jean.lambda.function.factory;

import com.jean.lambda.function.model.Album;
import com.jean.utils.generator.RandomDataGenerator;
import com.jean.utils.generator.impl.InitDataServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class AlbumBuilder {

    private RandomDataGenerator dataGenerator;
    private TrackBuilder trackBuilder;

    public AlbumBuilder(){
        dataGenerator = InitDataServiceProvider.getInstance();
        trackBuilder = new TrackBuilder();
    }

    private Album buildAlbum(int tracks) {
        Album album = new Album();
        album.setName(dataGenerator.getRandomString());
        album.setTracks(trackBuilder.buildTracks(tracks));
        return album;
    }


    public List<Album> buildAlbums(int albums, int tracks) {
        List<Album> albumList = new ArrayList<>();
        for (int i = 0; i < albums; i++) {
            albumList.add(buildAlbum(tracks));
        }
        return albumList;
    }
}
