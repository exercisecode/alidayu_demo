
# 阿里大鱼短信接口

## 使用SDK发送短信接口

### 传入值

- setExtend 公共回传参数. 支持json字符串, 可以传递id等信息
- setSmsType 短信类型. 短信使用normal
- setSmsFreeSignName 短信签名. 在短信前显示, 需要提交审批
- setParamString 短信模板变量. 参数json, 对应短信模板内参数
- setRecNum 短信接收号码. 手机号码
- setSmsTemplateCode 短信模板ID. 短信模板, 需要提交审批


### 返回值

```  
{
    "alibaba_aliqin_fc_sms_num_send_response": {
        "result": {
            "err_code": "0",
            "model": "101995642392^1102619126164",
            "success": true
        },
        "request_id": "14pdchcxzaj03"
    }
}
```  

错误返回值  

```  
{
    "error_response": {
        "code": 15,
        "msg": "Remote service error",
        "sub_code": "isv.SMS_TEMPLATE_ILLEGAL",
        "sub_msg": "短信模板不合法",
        "request_id": "r4m19o6jzhqy"
    }
}

```  




#### 需要字段

- request_id
- success
- model
- err_code




## 使用SDK查询短信  

### 传入值  

- setBizId   短信发送流水, 成功发送后的model字段值
- setRecNum  短信接收号码
- setQueryDate  短信发送日期. 支持最近30天记录查询. 格式yyyyMMdd
- setCurrentPage  分页参数, 页码
- setPageSize     分页参数, 每页数量. 最大值50



### 返回值  


```  
{
    "alibaba_aliqin_fc_sms_num_query_response": {
        "current_page": 1,
        "page_size": 50,
        "total_count": 2,
        "total_page": 1,
        "values": {
            "fc_partner_sms_detail_dto": [
                {
                    "extend": "{\"phoneNumber\":\"\",\"requestId\":\"1466648810296\"}",
                    "rec_num": "",
                    "sms_code": "SMS_10840762",
                    "sms_content": "【开发者李东旭】您正在演示项目\b验证手机号码，验证码********，如果不是本人操作请忽略\b该短信.",
                    "sms_status": 1
                },
                {
                    "extend": "扩展信息",
                    "rec_num": "",
                    "result_code": "DELIVRD",
                    "sms_code": "SMS_10840762",
                    "sms_content": "【开发者李东旭】您正在演示项目\b验证手机号码，验证码********，如果不是本人操作请忽略\b该短信.",
                    "sms_receiver_time": "2016-06-23 10:07:27",
                    "sms_send_time": "2016-06-23 10:07:21",
                    "sms_status": 3
                }
            ]
        },
        "request_id": "z24ab7kv7csn"
    }
}

```  




#### 需要字段

- extend  
- rec_num   
- result_code  
- sms_code  
- sms_content  
- sms_receiver_time  
- sms_send_time  
- sms_status  

状态不足时, 可能是未递送到接收号码.  





