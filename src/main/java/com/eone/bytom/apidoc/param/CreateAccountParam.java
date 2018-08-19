package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by zileanj
 */
public class CreateAccountParam {
    @ApiModelProperty(value = "pubkey array", required = true)
    public List<String> root_xpubs;

    @ApiModelProperty(value = "name of the account", required = true)
    public String alias;

    @ApiModelProperty(value = "the default value is 1, threshold of keys that must sign a transaction to spend asset units controlled by the account.", required = true)
    public Integer quorum=1;

    @ApiModelProperty(value = "if optional when creating account locally. However, if you want to create account remotely, it's indispensable.")
    public String access_token;

    public List<String> getRoot_xpubs() {
        return root_xpubs;
    }

    public void setRoot_xpubs(List<String> root_xpubs) {
        this.root_xpubs = root_xpubs;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getQuorum() {
        return quorum;
    }

    public void setQuorum(Integer quorum) {
        this.quorum = quorum;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("root_xpubs",root_xpubs);
        object.put("alias",alias);
        object.put("quorum",quorum);
        object.put("access_token",access_token);
        return object.toString();
    }


}
