package com.maiia.api;

import com.maiia.model.Post;
import com.maiia.service.PostPollerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostPollerController {

    @Autowired
    private PostPollerService postPollerService;

    @GetMapping("/employees/{id}")
    public List<Post> getPostByChunk(@PathVariable int chunk) {
        return postPollerService.getPostsByChunkSortedByTitle(chunk);
    }

}
