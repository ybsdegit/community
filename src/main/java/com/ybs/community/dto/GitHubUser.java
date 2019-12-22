package com.ybs.community.dto;

import lombok.Data;

/**
 * GitHubUser
 *
 * @author Paulson
 * @date 2019/12/6 23:44
 */
@Data
public class GitHubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;

}
