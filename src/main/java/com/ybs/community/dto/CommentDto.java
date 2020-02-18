package com.ybs.community.dto;

import lombok.Data;

/**
 * CommentDto
 *
 * @author Paulson
 * @date 2020/2/18 22:51
 */
@Data
public class CommentDto {
    private Long parentId;
    private String content;
    private Integer type;
}
