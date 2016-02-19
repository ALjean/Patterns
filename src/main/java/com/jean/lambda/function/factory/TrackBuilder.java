package com.jean.lambda.function.factory;

import com.jean.lambda.function.model.Track;
import com.jean.utils.generator.RandomDataGenerator;
import com.jean.utils.generator.impl.InitDataServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class TrackBuilder {

    private RandomDataGenerator dataGenerator;

    public TrackBuilder(){
        dataGenerator = InitDataServiceProvider.getInstance();
    }

    private Track buildTrack() {
        Track track = new Track();
        track.setName(dataGenerator.getRandomString());
        track.setLength(dataGenerator.getRandomInteger());
        return track;
    }


    public List<Track> buildTracks(int size) {
        List<Track> tracks = new ArrayList<>();
        for (int i = 0; i < size; i++) {

            tracks.add(buildTrack());
        }
        return tracks;
    }
}
