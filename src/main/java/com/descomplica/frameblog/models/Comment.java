package com.descomplica.frameblog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentedId;
    private String content;
    private Date date;
    @ManyToOne
    private Post userId;
    @ManyToOne
    private User postId;

    public Comment() {
    }

    public Comment(Long commentedId, String content, Date date, User postId, Post userId) {
        this.commentedId = commentedId;
        this.content = content;
        this.date = date;
        this.postId = postId;
        this.userId = userId;
    }

    public Long getCommentedId() {
        return commentedId;
    }

    public void setCommentedId(Long commentedId) {
        this.commentedId = commentedId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Post getUserId() {
        return userId;
    }

    public void setUserId(Post userId) {
        this.userId = userId;
    }

    public User getPostId() {
        return postId;
    }

    public void setPostId(User postId) {
        this.postId = postId;
    }

}
