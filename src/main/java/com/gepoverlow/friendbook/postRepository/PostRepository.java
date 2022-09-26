package com.gepoverlow.friendbook.postRepository;

import com.gepoverlow.friendbook.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE post SET post_content = :new_post_content WHERE id = :id", nativeQuery = true)
    Integer updatePost(@Param("id") Long id, @Param("new_post_content") String newContent);

}
