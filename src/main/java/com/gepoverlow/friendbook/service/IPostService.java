package com.gepoverlow.friendbook.service;

import com.gepoverlow.friendbook.model.Post;

import java.util.List;
import java.util.Optional;

public interface IPostService {

    List<Post> getAllPosts();

    Post createPost(Post post);

    Post updatePost(Post post);

    Optional<Post> getPostById(Long id);


    void deletePost(Long id);

}
