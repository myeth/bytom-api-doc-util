package com.eone.bytom.apidoc.respone;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by zileanj
 */
public class ListAddressRespone {

    @ApiModelProperty(value = " account_alias, alias of account.")
    public String account_alias;

    @ApiModelProperty(value = " id of account.")
    public String account_id;

    @ApiModelProperty(value = "address of account.")
    public String address;

    @ApiModelProperty(value = " whether the account address is change")
    public boolean change;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }
}
