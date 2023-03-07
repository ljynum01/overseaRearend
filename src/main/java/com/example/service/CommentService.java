package com.example.service;

import com.example.model.Comment;

import java.util.List;

public interface CommentService {
    public Boolean insetComment(Comment comment);

    public Boolean deleteComment(Integer id);

    public List<Comment> selectAllComment();
}
