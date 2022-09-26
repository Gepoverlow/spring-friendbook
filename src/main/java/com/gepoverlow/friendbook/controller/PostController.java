package com.gepoverlow.friendbook.controller;

import com.gepoverlow.friendbook.model.Post;
import com.gepoverlow.friendbook.service.PostService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts(){

       return postService.getAllPosts();

    }

    @GetMapping(path = "/{id}")
    public Optional<Post> getPostById(@PathVariable Long id){

        return postService.getPostById(id);

    }

    @PostMapping
    public Post createPost(@NotNull @RequestBody Post post){

        return postService.createPost(post);

    }

    @PutMapping(path = "{id}")
    public Integer updatePost(@PathVariable Long id, @NotNull @RequestBody String newContent){

        return postService.updatePostById(id, newContent);

    }

    @DeleteMapping(path = "/{id}")
    public void deletePost(@PathVariable Long id){

        postService.deletePost(id);

    }

}
