package com.maiia.client;

import com.maiia.model.Post;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("https://jsonplaceholder.typicode.com/")
public interface JsonPlaceHolderClient {

    @GetMapping(value = "/posts")
    List<Post> getPosts();
}