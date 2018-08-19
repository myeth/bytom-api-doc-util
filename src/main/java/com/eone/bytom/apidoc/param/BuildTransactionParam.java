package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

import java.util.List;

public class BuildTransactionParam {
    @ApiModelProperty(value = "name of the asset.", required = true)
    public String base_transaction;

    @ApiModelProperty(value = " time stamp(block height)is maximum survival time for the transaction, the transaction will be not submit into block after this time stamp.", required = true)
    public Long  time_range;

    @ApiModelProperty(value = " ttl, integer of the time to live in milliseconds, it means utxo will be reserved(locked) for builded transaction in this time range, if the transaction will not to be submitted into block, it will be auto unlocked for build transaction again after this ttl time. it will be set to 5 minutes(300 seconds) defaultly when ttl is 0.", required = true)
    public Integer  ttl;


    @ApiModelProperty(value = "actions", required = true)
    public List<TransactionParam> actions;
    public String toString(){
        JSONObject object=new JSONObject();
        object.put("base_transaction",base_transaction);
        object.put("time_range",time_range);
        object.put("ttl",ttl);
        object.put("actions",actions);
        return object.toString();
    }
}
