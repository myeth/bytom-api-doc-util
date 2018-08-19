package com.eone.bytom.apidoc.respone;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by zileanj
 */
public class CreateAccountRespone {
    @ApiModelProperty(value = "pubkey array", required = true)
    public List<String> xpubs;

    @ApiModelProperty(value = "account id.", required = true)
    public String id;
    @ApiModelProperty(value = "name of the account", required = true)
    public String alias;
    @ApiModelProperty(value = " key index of account.", required = true)
    public Integer key_index;

    @ApiModelProperty(value = "the default value is 1, threshold of keys that must sign a transaction to spend asset units controlled by the account.", required = true)
    public Integer quorum=1;

    @ApiModelProperty(value = "if optional when creating account locally. However, if you want to create account remotely, it's indispensable.")
    public String access_token;

    public List<String> getXpubs() {
        return xpubs;
    }

    public void setXpubs(List<String> xpubs) {
        this.xpubs = xpubs;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getKey_index() {
        return key_index;
    }

    public void setKey_index(Integer key_index) {
        this.key_index = key_index;
    }
}
