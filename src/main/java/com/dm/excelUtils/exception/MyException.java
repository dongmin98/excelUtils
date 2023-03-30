package com.dm.excelUtils.exception;

/**
 * 自定义异常
 */
public class MyException extends RuntimeException {
    // 异常代码
    private String code;

    // 异常信息
    private String message;

    public MyException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
