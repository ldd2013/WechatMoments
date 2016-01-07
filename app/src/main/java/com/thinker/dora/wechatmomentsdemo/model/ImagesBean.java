package com.thinker.dora.wechatmomentsdemo.model;

import com.thinker.dora.wechatmomentsdemo.tools.MyToolbox;

/**
 * Created by dora on 2016/1/5.
 */
public class ImagesBean {
    private String url;

    public String getUrl() {
        return MyToolbox.paramIsNull(url);
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
