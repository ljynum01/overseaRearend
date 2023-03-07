package com.example.controller;

import com.example.model.Area;
import com.example.model.Comment;
import com.example.service.CommentService;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RestController
@Api(tags = "商品评论接口")
@RequestMapping("/comment")
public class CommentController {

    @Resource
    private CommentService commentService;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date t;
    @PostMapping("/insert")
    public Boolean insert(@RequestBody Comment comment) {
//        Date date = new Date();
//        comment.setPtime(date);

//        Date date = new Date();
//        long times = date.getTime();//时间戳
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateString = formatter.format(date);
//        System.out.println(dateString);

        SimpleDateFormat formatter
                = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
//        String input = "1818-11-11 11:11:11";
        String input = formatter.format(new Date());
        try {
            t = formatter.parse(input);
            System.out.println(t);
            comment.setPtime(t);
        } catch (ParseException e) {
            System.out.println("unparseable using " + formatter);
        }

        Boolean aBoolean = commentService.insetComment(comment);
        return aBoolean;
    }

    @GetMapping("/delete")
    public Boolean delete(Integer id) {
        Boolean aBoolean = commentService.deleteComment(id);
        return aBoolean;
    }

    @ApiOperation("查看所有评论")
    @GetMapping("/findAll")
    public List<Comment> findAll(){
        return commentService.selectAllComment();
    }

}
