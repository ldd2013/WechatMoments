package com.thinker.dora.wechatmomentsdemo.tools;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;


/**
 * 请求集成
 * @author Dora
 *
 */
public class VolleyTool {
	private static VolleyTool mInstance = null;
    private RequestQueue mRequestQueue;
    private ImageLoader mImageLoader;
    
    private VolleyTool(Context context) {
    	mRequestQueue = Volley.newRequestQueue(context);
    	mImageLoader = new ImageLoader(mRequestQueue, new BitmapCache());
    }
    
    public static VolleyTool getInstance(Context context){
        if(mInstance == null){
    		mInstance = new VolleyTool(context);
        }
        return mInstance;
    }
    
	public RequestQueue getmRequestQueue() {
		return mRequestQueue;
	}

	public ImageLoader getmImageLoader() {
		return mImageLoader;
	}

	public void release() {
		this.mImageLoader = null;
		this.mRequestQueue = null;
		mInstance = null;
	}
}
