package com.eone.bytom.apidoc.rest;


import com.eone.bytom.apidoc.param.CheckAccessTokenParam;
import com.eone.bytom.apidoc.param.CreateAccessTokenParam;
import com.eone.bytom.apidoc.param.DeleteAccessTokenParam;
import com.eone.bytom.apidoc.respone.Respone;
import com.eone.bytom.apidoc.util.APIUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.IOException;

@RestController
public class NoNeedWalletEnable {
    @Value("${bytom.apiserver.url}")
    public String bytomApiserverUrl;

    @Value("${bytom.apiserver.token}")
    public String bytomApiserverToken;

    @ApiOperation(tags = "transaction", value = "Submit transaction. Object - raw_transaction, raw_transaction of signed transaction.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/submit-transaction")
    public String submitTransaction(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr,"submit-transaction",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "transaction", value = "Estimate consumed neu(1BTM = 10^8NEU) for the transaction. Parameters\n" +
            "Object:\n" +
            "\n" +
            "Object - transaction_template, builded transaction response.\n")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/estimate-transaction-gas")
    public String estimateTransactionGas(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr,"estimate-transaction-gas",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "access-token", value = "Create access token, it provides basic access authentication for HTTP protocol, returns token contain username and password, they are separated by a colon.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/create-access-token")
    public String createAccessToken(@Valid @RequestBody CreateAccessTokenParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"create-access-token",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "access-token", value = "(remote server will be return BTM860 )Returns the list of all available access tokens.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-access-tokens")
    public String listAccessTokens() throws IOException {
        return APIUtil.sendHttpPost("{}","list-access-tokens",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "access-token", value = "Delete existed access token.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/delete-access-token")
    public String deleteAccessToken(@Valid @RequestBody DeleteAccessTokenParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"delete-access-token",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "access-token", value = "Check access token is valid.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/check-access-token")
    public String checkAccessToken(@Valid @RequestBody CheckAccessTokenParam bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"check-access-token",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "transaction-feed", value = "Create transaction feed.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/create-transaction-feed")
    public String createTransactionFeed(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"create-transaction-feed",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "transaction-feed", value = "Query detail transaction feed by name.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-transaction-feed")
    public String getTransactionFeed(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-transaction-feed",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "transaction-feed", value = "Returns the list of all available transaction feeds.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-transaction-feeds")
    public String listTransactionFeeds(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"list-transaction-feeds",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "transaction-feed", value = "Delete transaction feed by name.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/delete-transaction-feed.")
    public String deleteTransactionFeed(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"delete-transaction-feed",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "transaction-feed", value = "Update transaction feed.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/update-transaction-feed")
    public String updateTransactionFeed(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"update-transaction-feed",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "transaction", value = "Query mempool transaction by transaction ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-unconfirmed-transaction")
    public String getUnconfirmedTransaction(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-unconfirmed-transaction",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "transaction", value = "Returns the total number of mempool transactions and the list of transaction IDs.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-unconfirmed-transactions")
    public String listUnconfirmedTransactions(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"list-unconfirmed-transactions",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "transaction", value = "Decode a serialized transaction hex string into a JSON object describing the transaction.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/decode-raw-transaction")
    public String decodeRawTransaction(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"decode-raw-transaction",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "block", value = "Returns the current block height for blockchain.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-block-count")
    public String getBlockCount(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-block-count",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "block", value = "Returns the current block hash for blockchain.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-block-hash")
    public String getBlockHash(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-block-hash",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "block", value = "Returns the detail block by block height or block hash.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-block")
    public String getBlock(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-block",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "block", value = "Returns the detail block header by block height or block hash.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-block-header")
    public String getBlockHeader(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-block-header",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "block", value = "Returns the block difficulty by block height or block hash, it returns the current block difficulty when request is empty.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-difficulty")
    public String getDifficulty(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-difficulty",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "block", value = "Returns the block hash rate by block height or block hash, it returns the current block hash rate when request is empty.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-hash-rate")
    public String getHashRate(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-hash-rate",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "block", value = "Returns the information of current network node.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/net-info")
    public String netInfo(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"net-info",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "block", value = "Returns the mining status.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/is-mining")
    public String isMining(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"is-mining",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "block", value = "Start up node mining.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/set-mining")
    public String setMining(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"set-mining",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "block", value = "Quary gas rate.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/gas-rate")
    public String gasRate(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"gas-rate",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "transaction", value = "Verify a signed message with derived pubkey of the address.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/verify-message")
    public String verifyMessage(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"verify-message",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "transaction", value = "Decode program.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/decode-program")
    public String decodeProgram(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"decode-program",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "transaction", value = "Compile equity contract.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/compile")
    public String compile(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"compile",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "block", value = "Returns the list of connected peers")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/list-peers")
    public String listPeers(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"list-peers",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "block", value = "Disconnect to specified peer.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/disconnect-peer")
    public String disconnectPeer(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"disconnect-peer",bytomApiserverUrl,bytomApiserverToken);
    }

    @ApiOperation(tags = "block", value = "connect to specified peer.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/connect-peer")
    public String connectPeer(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"connect-peer",bytomApiserverUrl,bytomApiserverToken);
    }



    @ApiOperation(tags = "work", value = "Get the proof of work.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-work")
    public String getWork(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-work",bytomApiserverUrl,bytomApiserverToken);
    }



    @ApiOperation(tags = "work", value = "Submit the proof of work.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/submit-work")
    public String submitWork(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"submit-work",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "work", value = "Get the proof of work by json.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/get-work-json")
    public String getWorkJson(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"get-work-json",bytomApiserverUrl,bytomApiserverToken);
    }


    @ApiOperation(tags = "work", value = "Submit the proof of work by json.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "normal response", response = Respone.class),
            @ApiResponse(code = 404, message = "no resource")
    })
    @PostMapping("/submit-work-json")
    public String submitWorkJson(@Valid @RequestBody String bodyStr) throws IOException {
        return APIUtil.sendHttpPost(bodyStr.toString(),"submit-work-json",bytomApiserverUrl,bytomApiserverToken);
    }









}
