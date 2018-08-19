package com.eone.bytom.apidoc.param;


import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class ListPubkeysParam {



    @ApiModelProperty(value = "optional:  account_alias, alias of account.")
    public String account_alias;

    @ApiModelProperty(value = "optional:  id of account.")
    public String account_id;
    @ApiModelProperty(value = "optional:  public_key")
    public String public_key;

    public String getAccount_alias() {
        return account_alias;
    }

    public void setAccount_alias(String account_alias) {
        this.account_alias = account_alias;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getPublic_key() {
        return public_key;
    }

    public void setPublic_key(String public_key) {
        this.public_key = public_key;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("account_alias",account_alias);
        object.put("account_id",account_id);
        object.put("public_key",public_key);
        return object.toString();
    }
}
