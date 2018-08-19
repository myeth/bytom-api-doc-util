package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class CreateAccessTokenParam {


    @ApiModelProperty(value = " id token ID",required = true)
    public String id;

    @ApiModelProperty(value = " type, type of token")
    public String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("id",id);
        object.put("type",type);
        return object.toString();
    }


}
