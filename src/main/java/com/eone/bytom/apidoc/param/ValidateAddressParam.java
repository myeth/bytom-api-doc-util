package com.eone.bytom.apidoc.param;


import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class ValidateAddressParam {




    @ApiModelProperty(value = " address of account", required = true)
    public String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("address",address);
        return object.toString();
    }
}
