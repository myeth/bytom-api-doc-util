package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by zileanj
 */
public class CreateAssetParam {

    @ApiModelProperty(value = "name of the asset.", required = true)
    public String alias;

    @ApiModelProperty(value = "pubkey array", required = true)
    public List<String> root_xpubs;

    @ApiModelProperty(value = "the default value is 1, threshold of keys that must sign a transaction to spend asset units controlled by the account.", required = true)
    public Integer quorum=1;

    @ApiModelProperty(value = "definition of asset")
    public Object definition;

    @ApiModelProperty(value = "if optional when creating asset locally. However, if you want to create asset remotely, it's indispensable", required = true)
    public String access_token;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<String> getRoot_xpubs() {
        return root_xpubs;
    }

    public void setRoot_xpubs(List<String> root_xpubs) {
        this.root_xpubs = root_xpubs;
    }

    public Integer getQuorum() {
        return quorum;
    }

    public void setQuorum(Integer quorum) {
        this.quorum = quorum;
    }

    public Object getDefinition() {
        return definition;
    }

    public void setDefinition(Object definition) {
        this.definition = definition;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("alias",alias);
        object.put("quorum",quorum);
        object.put("root_xpubs",root_xpubs);
        object.put("definition",definition);
        object.put("access_token",access_token);
        return object.toString();
    }


}
