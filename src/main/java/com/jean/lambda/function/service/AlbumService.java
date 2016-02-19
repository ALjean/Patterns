package com.jean.lambda.function.service;

import com.jean.lambda.function.model.Album;

import java.util.List;
import java.util.Set;

public interface AlbumService {

    Set<String> findLongTracks(List<Album> albums);
}
