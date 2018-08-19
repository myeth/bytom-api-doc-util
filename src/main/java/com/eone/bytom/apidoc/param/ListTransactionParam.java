package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class ListTransactionParam {


    @ApiModelProperty(value = " transaction id, hash of transaction.")
    public String id;

    @ApiModelProperty(value = " id of account")
    public String account_id;

    @ApiModelProperty(value = "detail , flag of detail transactions, default false (only return transaction summary)")
    public Boolean  detail=false ;

    @ApiModelProperty(value = "unconfirmed, flag of unconfirmed transactions(query result include all confirmed and unconfirmed transactions), default false.")
    public Boolean  unconfirmed=false ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public Boolean getDetail() {
        return detail;
    }

    public void setDetail(Boolean detail) {
        this.detail = detail;
    }

    public Boolean getUnconfirmed() {
        return unconfirmed;
    }

    public void setUnconfirmed(Boolean unconfirmed) {
        this.unconfirmed = unconfirmed;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("id",id);
        object.put("account_id",account_id);
        object.put("detail",detail );
        object.put("unconfirmed",unconfirmed);
        return object.toString();
    }


}
