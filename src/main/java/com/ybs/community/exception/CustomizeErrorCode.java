package com.ybs.community.exception;

/**
 * CustomizeErrorCode
 *
 * @author Paulson
 * @date 2020/2/18 0:36
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOTE_FOUND("你找的问题不在了，要不要换个试试！！！");

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
