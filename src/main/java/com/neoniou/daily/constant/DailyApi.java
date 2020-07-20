package com.neoniou.daily.constant;

/**
 * @author Neo.Zzj
 * @date 2020/6/22
 */
public interface DailyApi {

    String SWU_INDEX = "http://authserverxg.swu.edu.cn/authserver/login" +
            "?service=https://swu.cpdaily.com/wec-counselor-sign-apps/stu/sign/getStuSignInfosInOneDay";

    String SWU_LOGIN = "http://authserverxg.swu.edu.cn/authserver/login;sessionId" +
            "?service=https://swu.cpdaily.com/wec-counselor-sign-apps/stu/sign/getStuSignInfosInOneDay";

    String CP_AUTH = "https://mobile.campushoy.com/v6/auth/authentication/notcloud/login";

    String GET_MESSAGE = "https://openapi.cpdaily.com/message_pocket_web/V2/mp/restful/mobile/message/extend/get";

    String GET_FORM = "https://swu.cpdaily.com/wec-counselor-sign-apps/stu/sign/detailSignInstance";

    String SUBMIT_FORM = "https://swu.cpdaily.com/wec-counselor-sign-apps/stu/sign/submitSign";
}
