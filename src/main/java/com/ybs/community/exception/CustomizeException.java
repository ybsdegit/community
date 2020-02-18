package com.ybs.community.exception;

/**
 * CustomizeException
 *
 * @author Paulson
 * @date 2020/2/18 0:27
 */
public class CustomizeException extends RuntimeException {

    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

}
