package com.eone.bytom.apidoc.respone;


import io.swagger.annotations.ApiModelProperty;

/**
 * Created by zileanj
 */
public class ListKeysRespone {

    @ApiModelProperty(value = "name of the key", required = true)
    public String alias; //  name of the key.
    @ApiModelProperty(value = "pubkey of the key", required = true)
    public String xpub; // pubkey of the key.
    @ApiModelProperty(value = "path to the file of key", required = true)
    public String file; // path to the file of key.

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getXpub() {
        return xpub;
    }

    public void setXpub(String xpub) {
        this.xpub = xpub;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
