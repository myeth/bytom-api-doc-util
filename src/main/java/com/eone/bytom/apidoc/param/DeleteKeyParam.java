package com.eone.bytom.apidoc.param;


import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class DeleteKeyParam {


    @ApiModelProperty(value = "pubkey of the key", required = true)
    public String xpub; // pubkey of the key.

    @ApiModelProperty(value = "password of the key", required = true)
    public String password; // password of the key.

    public String getXpub() {
        return xpub;
    }

    public void setXpub(String xpub) {
        this.xpub = xpub;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("xpub",xpub);
        object.put("password",password);
        return object.toString();
    }
}
