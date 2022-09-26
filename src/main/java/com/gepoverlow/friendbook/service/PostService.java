package com.gepoverlow.friendbook.service;

import com.gepoverlow.friendbook.model.Post;
import com.gepoverlow.friendbook.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService implements IPostService {

    PostRepository postRepository;

    public PostService(PostRepository postRepository){

        this.postRepository = postRepository;

    }

    public List<Post> getAllPosts() {

        return postRepository.findAll();

    }

    public Post createPost(Post post) {

        return postRepository.save(post);

    }

    public Optional<Post> getPostById(Long id) {

        return postRepository.findById(id);

    }

    public Post updatePost(Post post) {

       return postRepository.save(post);

    }

    public Integer updatePostById(Long id, String newContent){

        return postRepository.updatePost(id, newContent);

    }

    public void deletePost(Long id) {

        postRepository.deleteById(id);

    }

}
