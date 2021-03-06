package com.hanter.xpulltorefresh.test;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;

import com.hanter.xpulltorefresh.LoadingLayout;
import com.hanter.xpulltorefresh.PullToRefreshLayout;

/**
 * 类名：MyPullToRefreshLayout <br/>
 * 描述：自定义下拉刷新布局类
 * 创建时间：2017/02/18 19:53
 *
 * @author hanter
 * @version 1.0
 */
public class MyPullToRefreshLayout extends PullToRefreshLayout {

    public MyPullToRefreshLayout(Context context) {
        super(context);
    }

    public MyPullToRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyPullToRefreshLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyPullToRefreshLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

}
