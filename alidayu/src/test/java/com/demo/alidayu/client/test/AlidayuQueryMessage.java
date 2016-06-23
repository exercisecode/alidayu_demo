package com.demo.alidayu.client.test;

import com.demo.alidayu.AlidayuConfig;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumQueryRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumQueryResponse;

public class AlidayuQueryMessage {

	public static void main(String[] args) {
		TaobaoClient client = new DefaultTaobaoClient(AlidayuConfig.url, AlidayuConfig.AppKey, AlidayuConfig.AppSecret);
		
		AlibabaAliqinFcSmsNumQueryRequest queryRequest = new AlibabaAliqinFcSmsNumQueryRequest();
		queryRequest.setBizId("");
		queryRequest.setRecNum(AlidayuConfig.recNum);
		queryRequest.setQueryDate("20160623");
		queryRequest.setCurrentPage(1L);
		queryRequest.setPageSize(50L);
		
		try{
		   AlibabaAliqinFcSmsNumQueryResponse queryResponse = client.execute(queryRequest);
		   
		   System.out.println("\n\n queryResponse: " + queryResponse);
		   
		   
		   System.out.println("\n\n body: " + queryResponse.getBody());
		   
		}catch(ApiException e){
			e.printStackTrace();
		}
		
		
		
		//extend (64),  rec_num (32),  result_code (16),   sms_code (32),  sms_content (255),  sms_receiver_time (datetime),  sms_send_time (datetime),  sms_status (16),   request_id (32)
		

	}

}
