package com.eone.bytom.apidoc.respone;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by zileanj
 */
public class ValidateAddressRespone {



    @ApiModelProperty(value = " whether the account address is valid")
    public boolean valid;
    @ApiModelProperty(value = " whether the account address is local.")
    public boolean is_local;

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isIs_local() {
        return is_local;
    }

    public void setIs_local(boolean is_local) {
        this.is_local = is_local;
    }
}
