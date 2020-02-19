package com.ybs.community.exception;

/**
 * CustomizeErrorCode
 *
 * @author Paulson
 * @date 2020/2/18 0:36
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOTE_FOUND(2001,"你找的问题不在了，要不要换个试试！！！"),
    TARGET_PARAM_NOT_FOUND(2002,"没有选中任何问题进行回复！！！"),
    NO_LOGIN(2003,"当前操作需要登录，请登录后进行重试！！！"),
    SYSTEM_ERROR(2004,"当前操作需要登录，请登录后进行重试！！！"),
    TYPE_PARAM_WRONG(2005,"评论类型错误！！！"),
    COMMENT_NOT_FOUND(2006, "你操作的评论不存在！！！")
    ;

    private Integer code;
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    CustomizeErrorCode(String message) {
        this.code = code;
        this.message = message;
    }
}
