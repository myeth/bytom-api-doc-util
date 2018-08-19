package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class UpdateAssetParam {


    @ApiModelProperty(value = " id of asset", required = true)
    public String id;

    @ApiModelProperty(value = "name of the asset.", required = true)
    public String alias;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("id",id);
        object.put("alias",alias);
        return object.toString();
    }


}
