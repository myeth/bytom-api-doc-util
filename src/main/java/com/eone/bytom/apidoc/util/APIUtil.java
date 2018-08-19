package com.eone.bytom.apidoc.util;

import com.eone.bytom.apidoc.config.SwaggerConfig;
import com.squareup.okhttp.*;
import org.apache.commons.codec.binary.Base64;
import java.io.IOException;
import java.nio.charset.Charset;

public class APIUtil {

    public static String sendHttpPost(String bodyStr,String method,String bytomApiserverUrl,String bytomApiserverToken) throws IOException {
        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/octet-stream");
        RequestBody body = RequestBody.create(mediaType, bodyStr);
        Request request = new Request.Builder()
                .url(bytomApiserverUrl+"/"+method)
                .post(body)
                .addHeader("cache-control", "no-cache")
                .build();
        if (bytomApiserverUrl==null || bytomApiserverUrl.contains("127.0.0.1") || bytomApiserverUrl.contains("localhost")){

        }else {
            byte[] encodedAuth = Base64.encodeBase64(bytomApiserverToken.getBytes(Charset.forName("US-ASCII")));
            String authHeader = "Basic " + new String(encodedAuth);
            request = new Request.Builder()
                    .url(bytomApiserverUrl+"/"+method)
                    .post(body)
                    .addHeader("authorization", authHeader)
                    .addHeader("cache-control", "no-cache")
                    .build();
        }
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}