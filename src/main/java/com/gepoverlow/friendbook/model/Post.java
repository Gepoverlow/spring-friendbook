package com.gepoverlow.friendbook.model;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.*;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @SequenceGenerator(name = "post_sequence", sequenceName = "post_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "post_sequence")
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "post_content", nullable = false, columnDefinition = "TEXT")
    private String postContent;
    @Column(name = "post_author", nullable = false, columnDefinition = "TEXT")
    private String postAuthor;
    @Column(name = "creation_date", nullable = false, columnDefinition = "TEXT")
    private Date creationDate;

    @PrePersist
    protected void onCreate() {

        creationDate = new Date();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }
}
