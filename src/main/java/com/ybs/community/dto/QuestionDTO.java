package com.ybs.community.dto;

import com.ybs.community.model.User;
import lombok.Data;

/**
 * questionDTO
 *
 * @author Paulson
 * @date 2019/12/8 17:10
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
