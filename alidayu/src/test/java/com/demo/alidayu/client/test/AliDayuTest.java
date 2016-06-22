package com.demo.alidayu.client.test;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;

/**
 * Created by lidongxu on 6/21/16.
 * 
 * https://open.taobao.com/doc2/detail.htm?articleId=126&docType=1&treeId=null
 * 
 */
public class AliDayuTest {

    public static void main(String[] args){
    	
    	String serverUrl = "http://gw.api.tbsandbox.com/router/rest";
    	String appKey = "test";
    	String appSecret = "test";
    	//String sessionKey = "test";
    	
    	TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
    	
    	System.out.println("client=" + client);
    	

    }
}
