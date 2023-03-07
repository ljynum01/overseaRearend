package com.example.service.impl;

import com.example.mapper.CommentMapper;
import com.example.model.Comment;
import com.example.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public Boolean insetComment(Comment comment) {
        int insert = commentMapper.insertSelective(comment);
        return insert>0;
    }

    @Override
    public Boolean deleteComment(Integer id) {
        int i = commentMapper.deleteByPrimaryKey(id);
        return i>0;
    }

    @Override
    public List<Comment> selectAllComment() {
        List<Comment> comments = commentMapper.selectByExample(null);
        return comments;
    }
}
