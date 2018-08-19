package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class CreateKeyParam {

    @ApiModelProperty(value = "name of the key", required = true)
    public String alias; //  name of the key.

    @ApiModelProperty(value = "password of the key", required = true)
    public String password; // password of the key.

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("alias",alias);
        object.put("password",password);
        return object.toString();
    }


}
