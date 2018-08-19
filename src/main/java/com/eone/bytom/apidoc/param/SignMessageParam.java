package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class SignMessageParam {

    @ApiModelProperty(value = "address for account", required = true)
    public String address; //

    @ApiModelProperty(value = "message for signature by address xpub", required = true)
    public String message; //

    @ApiModelProperty(value = "password of the account", required = true)
    public String password;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("address",address);
        object.put("password",password);
        object.put("password",password);
        return object.toString();
    }


}
