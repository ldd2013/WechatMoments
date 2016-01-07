package com.thinker.dora.wechatmomentsdemo.model;

/**
 * Created by Dora on 2016/1/6.
 */
public class TweetsResponse {
    private TweetsItemBean[] data;

    public TweetsItemBean[] getData() {
        return data;
    }

    public void setData(TweetsItemBean[] data) {
        this.data = data;
    }
}
