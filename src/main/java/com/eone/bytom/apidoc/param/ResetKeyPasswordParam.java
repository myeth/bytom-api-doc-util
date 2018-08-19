package com.eone.bytom.apidoc.param;


import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class ResetKeyPasswordParam {


    @ApiModelProperty(value = "pubkey of the key", required = true)
    public String xpub; // pubkey of the key.

    @ApiModelProperty(value = " old password of the key.", required = true)
    public String old_password;
    @ApiModelProperty(value = "new password of the key", required = true)
    public String new_password;

    public String getXpub() {
        return xpub;
    }

    public void setXpub(String xpub) {
        this.xpub = xpub;
    }

    public String getOld_password() {
        return old_password;
    }

    public void setOld_password(String old_password) {
        this.old_password = old_password;
    }

    public String getNew_password() {
        return new_password;
    }

    public void setNew_password(String new_password) {
        this.new_password = new_password;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("xpub",xpub);
        object.put("old_password",old_password);
        object.put("new_password",new_password);
        return object.toString();
    }
}
