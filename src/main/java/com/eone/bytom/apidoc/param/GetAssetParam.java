package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class GetAssetParam {


    @ApiModelProperty(value = " id of asset")
    public String id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("id",id);
        return object.toString();
    }


}
