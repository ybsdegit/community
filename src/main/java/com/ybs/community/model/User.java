package com.ybs.community.model;

import lombok.Data;

import javax.swing.*;

/**
 * user
 *
 * @author Paulson
 * @date 2019/12/7 14:21
 */
@Data
public class User {
    private int id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}
