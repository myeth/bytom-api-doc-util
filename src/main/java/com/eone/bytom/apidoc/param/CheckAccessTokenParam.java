package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class CheckAccessTokenParam {


    @ApiModelProperty(value = " id token ID",required = true)
    public String id;

    @ApiModelProperty(value = " secret of token, the second part of the colon division for token.",required = true)
    public String secret;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("id",id);
        object.put("secret",secret);
        return object.toString();
    }


}
