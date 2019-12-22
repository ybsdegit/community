package com.ybs.community.model;

import lombok.Data;

/**
 * Question
 *
 * @author Paulson
 * @date 2019/12/7 22:15
 */

@Data
public class Question {
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
}
