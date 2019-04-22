package com.chunyan.daggertest.mvp;

import android.text.TextUtils;

public class LoginModules {
    //这里模拟网络请求
    public String login(String name, String password) {
        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(password)) {
            if ("admin".equals(name) && "123456".equals(password)) {
                return "登陆成功";
            } else {
                return "登陆失败";
            }

        }
        return "";
    }
}
