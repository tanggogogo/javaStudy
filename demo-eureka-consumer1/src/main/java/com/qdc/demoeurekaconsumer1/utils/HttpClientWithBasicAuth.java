package com.qdc.demoeurekaconsumer1.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpClientWithBasicAuth {
    public HttpClientWithBasicAuth(){

    }
    /*
    * @return
    * */
    private String getHeader(String Username,String Password){

        String auth = Username + ":" + Password;

        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic " + new String(encodedAuth);
        System.out.println("authHeader:"+authHeader);
        return authHeader;
    }

    public String send(String url, String Username, String password, Map<String,String> params){
        HttpPost post = new HttpPost(url);
        //httpGet
        CloseableHttpClient client = HttpClients.createDefault();
        List<NameValuePair> paramList = new ArrayList<NameValuePair>();
        if (params != null && params.size()>0){
            Set<String> keySet = params.keySet();
            for (String key : keySet) {
                //System.out.println(key);
                paramList.add(new BasicNameValuePair(key,params.get(key)));
            }
            /*for (NameValuePair nameValuePair : paramList) {
                System.out.println(nameValuePair);
            }*/
        }
        try {
            post.setEntity(new UrlEncodedFormEntity(paramList,"utf-8"));
        }catch (UnsupportedEncodingException e1){
            e1.printStackTrace();
        }

        post.addHeader("Authorization",getHeader(Username,password));
        String responseContent = null;
        CloseableHttpResponse response = null;
        try {
            System.out.println("post:"+post);
            response = client.execute(post);
            System.out.println("response:"+response.getStatusLine());
            int status_code = response.getStatusLine().getStatusCode();
            System.out.println("status_code:"+status_code);
            if (response.getStatusLine().getStatusCode() == 200) {
                HttpEntity entity = response.getEntity();
                responseContent = EntityUtils.toString(entity, "utf-8");
            }
            System.out.println("responseContent:" + responseContent);
        }catch (ClientProtocolException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (response != null){
                    response.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try {
                    if (client != null){
                        client.close();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return responseContent;
    }
}
