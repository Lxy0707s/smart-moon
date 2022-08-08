package com.unio.smartmoon.utils.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response implements Serializable {

    private Integer code;
    private String message;
    private Object data;

    public void setResultCodeAndMessage(ResultCodeEnum resultCodeEnum) {
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }

    // =============================================== 构造的方式 ===============================================

    /**
     * 返回不带数据的成功
     *
     * @return
     */
    public static Response success() {
        Response response = new Response();
        response.setResultCodeAndMessage(ResultCodeEnum.SUCCESS);
        return response;
    }

    /**
     * 返回带数据的成功
     *
     * @return
     */
    public static Response success(Object data) {
        Response response = new Response();
        response.setResultCodeAndMessage(ResultCodeEnum.SUCCESS);
        response.setData(data);
        return response;
    }

    /**
     * 返回不带数据的失败
     *
     * @return
     */
    public static Response failure(ResultCodeEnum resultCodeEnum) {
        Response response = new Response();
        response.setResultCodeAndMessage(resultCodeEnum);
        return response;
    }

    /**
     * 返回带数据的失败
     *
     * @return
     */
    public static Response failure(ResultCodeEnum resultCodeEnum, Object data) {
        Response response = new Response();
        response.setResultCodeAndMessage(resultCodeEnum);
        response.setData(data);
        return response;
    }

    // =============================================== 追加的方式 ===============================================

    /**
     * 添加响应编号
     *
     * @return
     */
    public static Response code(Integer code) {
        Response response = new Response();
        response.setCode(code);
        return response;
    }

    /**
     * 追加响应消息
     *
     * @return
     */
    public Response message(String message) {
        this.message = message;
        return this;
    }

    /**
     * 追加响应数据
     *
     * @return
     */
    public Response data(Object data) {
        this.data = data;
        return this;
    }

}


