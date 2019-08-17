package cn.bdqn.util;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class Proving {

    //我的密钥id
    private String accessKeyId = "LTAI4cEaj6pKEd4a";

    //我的密钥
    private String sectet = "HEDg3X5AKmrnJXhZXjwHbChSC6KvEd";

    //验证码签名模板
    private String signName = "泡面联盟";

    //短信模板
    private String templateCode = "SMS_172601017";
    /**
     * 发送短信验证码方法xxx
     * 调用本方法后再调用getRadonNumber才可以获得验证码
     * @param phone 要发送的手机号
     * @return true发送成功 false发送失败
     */
    public boolean verification(String phone){

        DefaultProfile profile = DefaultProfile.getProfile("default", this.accessKeyId,
                this.sectet);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "default");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", this.signName);
        request.putQueryParameter("TemplateCode", this.templateCode);
        radonNumber();
        request.putQueryParameter("TemplateParam", "{\"code\":\""+ radonNumber() + "\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            JSONObject json = (JSONObject) JSONObject.parse(response.getData());
            String code = json.getString("Code");
            if ("OK".equals(code)) return true;
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return false;
    }

    //随机获得一位四位数验证码
    public String getRadonNumber = "";//先调用发送验证码的方法再获取这个验证码
    private String radonNumber() {
        getRadonNumber = String.valueOf((int) (Math.random() * (9999 - 1000 + 1)) + 1000);
        return getRadonNumber;
    }
}
