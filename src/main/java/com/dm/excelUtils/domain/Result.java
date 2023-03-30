package com.dm.excelUtils.domain;

public class Result<T> {

    private String code;

    private String msg;

    private T data;

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static<T> Result sucess(T data) {
        return new Result("0000", "成功", data);
    }

    public static<T> Result fail(T data) {
        return new Result("1111", "失败", data);
    }

    public static<T> Result sucess() {
        return new Result("0000", "成功");
    }

    public static<T> Result fail() {
        return new Result("1111", "失败");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
