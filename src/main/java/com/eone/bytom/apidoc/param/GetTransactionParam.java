package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

/**
 * Created by zileanj
 */
public class GetTransactionParam {


    @ApiModelProperty(value = " Query the account related transaction by transaction ID. ",required =true)
    public String tx_id;

    public String getTx_id() {
        return tx_id;
    }

    public void setTx_id(String tx_id) {
        this.tx_id = tx_id;
    }

    public String toString(){
        JSONObject object=new JSONObject();
        object.put("tx_id",tx_id);
        return object.toString();
    }


}
