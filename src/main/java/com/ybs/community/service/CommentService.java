package com.ybs.community.service;

import com.ybs.community.enums.CommentTypeEnum;
import com.ybs.community.exception.CustomizeErrorCode;
import com.ybs.community.exception.CustomizeException;
import com.ybs.community.mapper.CommentMapper;
import com.ybs.community.mapper.QuestionExtMapper;
import com.ybs.community.mapper.QuestionMapper;
import com.ybs.community.model.Comment;
import com.ybs.community.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * CommentService
 *
 * @author Paulson
 * @date 2020/2/19 22:05
 */

@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private QuestionExtMapper questionExtMapper;


    @Transactional
    public void insert(Comment comment) {
        if (comment.getParentId() == null || comment.getParentId() == 0){
            throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM_NOT_FOUND);
        }

        if (comment.getType() == null || CommentTypeEnum.isExist(comment.getType())){
            throw new CustomizeException(CustomizeErrorCode.TYPE_PARAM_WRONG);
        }

        if (comment.getType() == CommentTypeEnum.COMMENT.getType()){
            // 回复评论
            Comment dbComment = commentMapper.selectByPrimaryKey(comment.getParentId());
            if (dbComment == null){
                throw new CustomizeException(CustomizeErrorCode.COMMENT_NOT_FOUND);
            }
            commentMapper.insert(comment);
        }else {
            // 回复问题
            Question question = questionMapper.selectByPrimaryKey(Math.toIntExact(comment.getParentId()));
            if (question == null){
                throw new CustomizeException(CustomizeErrorCode.QUESTION_NOTE_FOUND);
            }
            commentMapper.insert(comment);
            question.setCommentCount(1);
            questionExtMapper.incCommentCount(question);
        }
    }
}
