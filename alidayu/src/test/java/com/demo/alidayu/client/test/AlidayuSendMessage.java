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

		/// send message
		String serverUrl = AlidayuConfig.url;
		String appKey = AlidayuConfig.AppKey;
		String appSecret = AlidayuConfig.AppSecret;

		TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
		System.out.println("client: " + client);

		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		Map<String, String> extendMap = new HashMap<String, String>();
		extendMap.put("requestId", String.valueOf(System.currentTimeMillis()));
		extendMap.put("phoneNumber", AlidayuConfig.recNum);
		
		req.setExtend(new JSONObject(extendMap).toString());
		req.setSmsType("normal");
		req.setSmsFreeSignName(AlidayuConfig.smsFreeSignName);

		Map<String, String> paramMap = new HashMap<String, String>();
		//paramMap.put("customer", AlidayuConfig.Customer);
		
		paramMap.put("product", "演示项目");
		paramMap.put("code", "123456");

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
		
		// {"alibaba_aliqin_fc_sms_num_send_response":{"result":{"err_code":"0","model":"101995153795^1102618458965","success":true},"request_id":"qm4co0vj1zv1"}}
	
		// {"alibaba_aliqin_fc_sms_num_send_response":{"result":{"err_code":"0","model":"101995524903^1102618894194","success":true},"request_id":"101z16vhfagi2"}}

		// {"alibaba_aliqin_fc_sms_num_send_response":{"result":{"err_code":"0","model":"101995642392^1102619126164","success":true},"request_id":"14pdchcxzaj03"}}

		// request_id (64) , error_code (16), model (64), success (16)
		

	}

}
