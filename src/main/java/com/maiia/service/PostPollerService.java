package com.maiia.service;

import com.maiia.client.JsonPlaceHolderClient;
import com.maiia.model.Post;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostPollerService {

    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    public PostPollerService(JsonPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    public List<Post> getPostsByChunkSortedByTitle(int chunk) {
        return jsonPlaceHolderClient.getPosts().stream().limit(chunk).sorted(Comparator.comparing(Post::getTitle)).collect(Collectors.<Post>toList());
    }
}
