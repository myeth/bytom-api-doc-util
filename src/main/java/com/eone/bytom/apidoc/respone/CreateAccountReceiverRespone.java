package com.eone.bytom.apidoc.respone;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class CreateAccountReceiverRespone {


    @ApiModelProperty(value = "address of account.")
    public String address;

    @ApiModelProperty(value = " control program of account")
    public String control_program;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getControl_program() {
        return control_program;
    }

    public void setControl_program(String control_program) {
        this.control_program = control_program;
    }
}
