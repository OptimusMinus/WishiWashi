package com.om.cleanitup;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by arensivio on 21.07.16.
 */
public class MyCustomTextView extends TextView {

    public MyCustomTextView(Context context, AttributeSet attrs){
        super(Context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "Actonia_PERSONAL.ttf"));

    }
}
