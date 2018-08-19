package com.eone.bytom.apidoc.param;


import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class DeleteAccountParam {




    @ApiModelProperty(value = "alias or ID of account.", required = true)
    public String account_info;

    public String getAccount_info() {
        return account_info;
    }

    public void setAccount_info(String account_info) {
        this.account_info = account_info;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("account_info",account_info);
        return object.toString();
    }
}
