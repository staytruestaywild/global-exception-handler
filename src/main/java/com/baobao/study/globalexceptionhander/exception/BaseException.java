package com.baobao.study.globalexceptionhander.exception;

import com.baobao.study.globalexceptionhander.enums.IResponseEnum;

/**
 * @author bwh
 * @date 2020/9/10 - 10:08
 * @Description
 */
public class BaseException extends RuntimeException {


    public BaseException(IResponseEnum responseEnum, Object[] args, String message) {

    }


    public BaseException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {

    }

}
