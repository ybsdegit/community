package com.ybs.community.mapper;

import com.ybs.community.model.Question;
import com.ybs.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {
   int incView(Question record);
}