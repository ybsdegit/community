package com.ybs.community.controller;

import com.ybs.community.dto.CommentDto;
import com.ybs.community.mapper.CommentMapper;
import com.ybs.community.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * CommentController
 *
 * @author Paulson
 * @date 2020/2/18 22:39
 */

@RestController
public class CommentController {

    @Autowired
    private CommentMapper commentMapper;

    @PostMapping("/comment")
    public Object post(@RequestBody CommentDto commentDto){
        Comment comment = new Comment();
        comment.setParentId(commentDto.getParentId());
        comment.setContent(commentDto.getContent());
        comment.setType(commentDto.getType());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setCommentator(1);
        comment.setLikeCount(0L);
        commentMapper.insert(comment);
        return null;
    }
}
