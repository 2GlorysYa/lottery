package com.isshin.lotterycommon.lottery.common;

import java.io.Serializable;

/**
 * @author Yibo Lei
 * @since 2023/6/4
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 2000730419393791264L;
    private String code;
    private String info;

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public static Result buildResult(String code, String info) {
        return new Result(code, info);
    }

    public static Result buildSuccessResult() {
        return new Result(Constants.ResponseCode.SUCCESS.getCode(),
                Constants.ResponseCode.SUCCESS.getInfo());
    }

    public static Result buildErrorResult() {
        return new Result(Constants.ResponseCode.UN_ERROR.getCode(),
                Constants.ResponseCode.UN_ERROR.getInfo());
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
