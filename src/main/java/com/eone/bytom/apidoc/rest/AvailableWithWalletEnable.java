package com.eone.bytom.apidoc.rest;


import com.eone.bytom.apidoc.param.*;
import com.eone.bytom.apidoc.respone.*;
import com.eone.bytom.apidoc.util.APIUtil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.IOException;

@Api(value = "need wallet's api", tags = "need wallet")
@RestController
public class AvailableWithWalletEnable {
    @Value("${bytom.apiserver.url}")
    public String bytomApiserverUrl;

    @Value("${bytom.apiserver.token}")
    public String bytomApiserverToken;


    @ApiOperation(tags = "key", value = "It is to create private key essentially, returns the information of key. The private key is encrypted in the file and not visible to the user")
    @ApiResponses(value = {		//Swagger Annotation
            @ApiResponse(code = 200, message = "normal response", response = CreateKeyRespone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/create-key")
    public String createKey(@Valid @RequestBody CreateKeyParam createKeyParam) throws IOException {
        return APIUtil.sendHttpPost(createKeyParam.toString(),"create-key",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "key", value = "Returns the list of all available keys.")
    @ApiResponses(value = {		//Swagger Annotation
            @ApiResponse(code = 200, message = "normal response", response = ListKeysRespone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-keys")
    public String listKeys() throws IOException {
        return APIUtil.sendHttpPost("","list-keys",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "key", value = "Delete existed key, please make sure that there is no balance in the related accounts.")
    @ApiResponses(value = {		//Swagger Annotation
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/delete-key")
    public String deleteKey(@Valid @RequestBody DeleteKeyParam deleteKeyParam) throws IOException {
        return APIUtil.sendHttpPost(deleteKeyParam.toString(),"delete-key",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "key", value = "Reset key password.")
    @ApiResponses(value = {		//Swagger Annotation
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/reset-key-password")
    public String resetKeyPassword(@Valid @RequestBody ResetKeyPasswordParam resetKeyPasswordParam) throws IOException {
        return APIUtil.sendHttpPost(resetKeyPasswordParam.toString(),"reset-key-password",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "account", value = "Create account to manage addresses. single sign account contain only one root_xpubs and quorum; however multi sign account contain many number of root_xpubs and quorum, quorum is the number of verify signature, the range is [1, len(root_xpubs)].")
    @ApiResponses(value = {		//Swagger Annotation
            @ApiResponse(code = 200, message = "normal response", response = CreateAccountRespone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/create-account")
    public String createAccount(@Valid @RequestBody CreateAccountParam createAccountParam) throws IOException {
        return APIUtil.sendHttpPost(createAccountParam.toString(),"create-account",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "account", value = "Returns the list of all available accounts.")
    @ApiResponses(value = {		//Swagger Annotation
            @ApiResponse(code = 200, message = "normal response", response = CreateAccountRespone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-accounts")
    public String listAccounts() throws IOException {
        return APIUtil.sendHttpPost("{}","list-accounts",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "account", value = "Returns the list of all available accounts.")
    @ApiResponses(value = {		//Swagger Annotation
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/delete-account")
    public String deleteAccount(@Valid @RequestBody DeleteAccountParam deleteAccountParam) throws IOException {
        return APIUtil.sendHttpPost(deleteAccountParam.toString(),"delete-account",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "account", value = "create address and control program, the address and control program is are one to one relationship. in build-transaction API, receiver is address when action type is control_address, and receiver is control program when action type is control_program, they are the same result.")
    @ApiResponses(value = {		//Swagger Annotation
            @ApiResponse(code = 200, message = "normal response", response = CreateAccountReceiverRespone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/create-account-receiver")
    public String createAccountReceiver(@Valid @RequestBody CreateAccountReceiverParam createAccountReceiverParam) throws IOException {
        return APIUtil.sendHttpPost(createAccountReceiverParam.toString(),"create-account-receiver",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "address", value = "Returns the list of all available addresses by account.")
    @ApiResponses(value = {		//Swagger Annotation
            @ApiResponse(code = 200, message = "normal response", response = ListAddressRespone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-addresses")
    public String listAddresses(@Valid @RequestBody ListAddressParam listAddressParam) throws IOException {
        return APIUtil.sendHttpPost(listAddressParam.toString(),"list-addresses",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "address", value = "Verify the address is valid, and judge the address is own.")
    @ApiResponses(value = {		//Swagger Annotation
            @ApiResponse(code = 200, message = "normal response", response = ValidateAddressRespone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/validate-address")
    public String validateAddress(@Valid @RequestBody ValidateAddressParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"validate-address",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "key", value = "Returns the list of all available pubkeys by account.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = ListPubkeysRespone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-pubkeys")
    public String listPubkeys(@Valid @RequestBody ListPubkeysParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"list-pubkeys",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "asset", value = "Create asset definition, it prepares for the issuance of asset.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/create-asset")
    public String createAsset(@Valid @RequestBody CreateAssetParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"create-asset",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "asset", value = "Query detail asset by asset ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-asset")
    public String getAsset(@Valid @RequestBody GetAssetParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-asset",bytomApiserverUrl,bytomApiserverToken);
    }
    @ApiOperation(tags = "asset", value = "Returns the list of all available assets.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-assets")
    public String listAssets() throws IOException {
        return APIUtil.sendHttpPost("{}","list-assets",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "asset", value = "Update asset alias by assetID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/update-asset-alias")
    public String updateAssetAlias(@Valid @RequestBody UpdateAssetParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"update-asset-alias",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "wallet", value = "Returns the list of all available account balances.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-balances")
    public String listBalances() throws IOException {
        return APIUtil.sendHttpPost("{}","list-balances",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "wallet", value = "Returns the list of all available unspent outputs for all accounts in your wallet.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-unspent-outputs")
    public String listUnspentOutputs(@Valid @RequestBody ListUnspentOutputsParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"list-unspent-outputs",bytomApiserverUrl,bytomApiserverToken);
    }



    @ApiOperation(tags = "wallet", value = "Backup wallet to image file, it contain accounts image, assets image and keys image.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/backup-wallet")
    public String backupWallet() throws IOException {
        return APIUtil.sendHttpPost("{}","backup-wallet",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "wallet", value = "Restore wallet by image file.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/restore-wallet")
    public String restoreWallet(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr,"restore-wallet",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "wallet", value = "Trigger to rescan block information into related wallet.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/rescan-wallet")
    public String rescanWallet() throws IOException {
        return APIUtil.sendHttpPost("{}","rescan-wallet",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "wallet", value = "Return the information of wallet.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/wallet-info")
    public String walletInfo() throws IOException {
        return APIUtil.sendHttpPost("{}","wallet-info",bytomApiserverUrl,bytomApiserverToken);
    }




    @ApiOperation(tags = "transaction", value = "Sign a message with the key password(decode encrypted private key) of an address.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/sign-message")
    public String signMessage(@Valid @RequestBody SignMessageParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"sign-message",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "transaction", value = "Query the account related transaction by transaction ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-transaction")
    public String getTransaction(@Valid @RequestBody GetTransactionParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-transaction",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "transaction", value = "Returns the list of all the account related transactions.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-transactions")
    public String listTransactions(@Valid @RequestBody ListTransactionParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"list-transactions",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "transaction", value = "Build transaction.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/build-transaction")
    public String buildTransaction(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"build-transaction",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "transaction", value = "Sign transaction.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/sign-transaction")
    public String signTransaction(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr,"sign-transaction",bytomApiserverUrl,bytomApiserverToken);
    }




}
