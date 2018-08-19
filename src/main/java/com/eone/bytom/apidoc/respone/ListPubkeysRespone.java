package com.eone.bytom.apidoc.respone;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by zileanj
 */
public class ListPubkeysRespone {



    @ApiModelProperty(value = " root xpub")
    public String root_xpub;

    @ApiModelProperty(value = " public key array.\n" +
            "String - pubkey, public key.\n" +
            "Object - derivation_path, derivated path for root xpub.")
    public List<Object> pubkey_infos;

    public String getRoot_xpub() {
        return root_xpub;
    }

    public void setRoot_xpub(String root_xpub) {
        this.root_xpub = root_xpub;
    }

    public List<Object> getPubkey_infos() {
        return pubkey_infos;
    }

    public void setPubkey_infos(List<Object> pubkey_infos) {
        this.pubkey_infos = pubkey_infos;
    }
}
