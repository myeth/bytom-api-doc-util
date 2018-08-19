package com.eone.bytom.apidoc.param;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by zileanj
 */
public class TransactionParam {

    @ApiModelProperty(value = "alias of account.", required = true)
    public String account_alias;
    @ApiModelProperty(value = " alias of asset.", required = true)
    public String asset_alias;

    @ApiModelProperty(value = " the specified asset of the amount sent with this transaction", required = true)
    public Long amount;

    @ApiModelProperty(value = "type of transaction, valid types: 'spend_account', 'issue', 'spend_account_unspent_output', 'control_address', 'control_program', 'retire'.", required = true)
    public String type;
    @ApiModelProperty(value = "address, (type is control_address) address of receiver, the style of address is P2PKH or P2SH", required = true)
    public String address;

    @ApiModelProperty(value = "(type is control_program) control program of receiver.", required = true)
    public String control_program;


    public String getAccount_alias() {
        return account_alias;
    }

    public void setAccount_alias(String account_alias) {
        this.account_alias = account_alias;
    }

    public String getAsset_alias() {
        return asset_alias;
    }

    public void setAsset_alias(String asset_alias) {
        this.asset_alias = asset_alias;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getControl_program() {
        return control_program;
    }

    public void setControl_program(String control_program) {
        this.control_program = control_program;
    }
}
