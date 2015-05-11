package com.fanslersoft.redditlive;


import android.graphics.drawable.Drawable;

/**
 * Created by poliveira on 24/10/2014.
 */
public class NavigationItem {
    private String mText;
    private String mSubText;
    private Drawable mDrawable;

    public NavigationItem(String text, String subText) {
        mText = text;
        mSubText = subText;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Drawable getDrawable() {
        return mDrawable;
    }

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
    }

    public void setSubText(String subText) {
        mSubText = subText;
    }

    public String getSubText() {
        return mSubText;
    }
}
