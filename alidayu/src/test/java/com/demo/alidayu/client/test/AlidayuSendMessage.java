package com.demo.alidayu.client.test;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.demo.alidayu.AlidayuConfig;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

/**
 * https://api.alidayu.com/doc2/apiDetail?spm=a3142.8062798.3.1.cNiUlP&apiId=
 * 25450
 * 
 * @author lidongxu
 *
 */
public class AlidayuSendMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String serverUrl = AlidayuConfig.url;
		String appKey = AlidayuConfig.AppKey;
		String appSecret = AlidayuConfig.AppSecret;

		TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
		System.out.println("client: " + client);

		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend("ex");
		req.setSmsType("normal");
		req.setSmsFreeSignName(AlidayuConfig.smsFreeSignName);

		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("customer", AlidayuConfig.Customer);

		JSONObject paramJson = new JSONObject(paramMap);
		req.setSmsParamString(paramJson.toString());

		req.setRecNum(AlidayuConfig.recNum);
		req.setSmsTemplateCode(AlidayuConfig.SmsTemplateCode);

		try {
			AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
			System.out.println(" rsp =" + rsp);
			System.out.println("\n\n rsp body= " + rsp.getBody());
		} catch (ApiException e) {
			e.printStackTrace();
		}

	}

}
