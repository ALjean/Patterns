package com.jean.lambda.function.service.impl;

import com.jean.lambda.function.model.Album;
import com.jean.lambda.function.model.Track;
import com.jean.lambda.function.service.AlbumService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*java 7 style*/
public class AlbumServiceJava7Impl implements AlbumService {

    @Override
    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet<>();
        for(Album album: albums){
            for(Track track: album.getTracks()){

                if(track.getLength() > 60){
                    trackNames.add(track.getName());
                }
            }
        }
        return trackNames;
    }
}
