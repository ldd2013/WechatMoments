package com.thinker.dora.wechatmomentsdemo.interfaces;

import com.thinker.dora.wechatmomentsdemo.model.TweetsItemBean;
import com.thinker.dora.wechatmomentsdemo.model.UserBean;

import java.util.ArrayList;

/**
 * Created by Dora on 2016/1/6.
 */
public interface OnUserInfoResponse {

    public void onSuccess(UserBean bean);

    public void onFailed();
}
