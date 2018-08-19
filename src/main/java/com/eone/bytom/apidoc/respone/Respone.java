package com.eone.bytom.apidoc.respone;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by zileanj
 */
public class Respone {

    @ApiModelProperty(value = "the status of respone", required = true)
    public String status;

    @ApiModelProperty(value = "if status = succees return")
    public String data;

    @ApiModelProperty(value = "if status = fail return")
    public String code;

    @ApiModelProperty(value = "if status = fail return")
    public String msg;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
}
