package com.omidbiz.android.persiansupport;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author omidbiz
 *
 */
public class PersianLabel extends TextView {

    Context ctx;
    AttributeSet attr;

    public PersianLabel(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.ctx = context;
        this.attr = attrs;
    }

    @Override
    public void setText(CharSequence text, BufferType type)
    {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB)
            super.setText(PersianReshape.reshape(text.toString()), type);
        else
            super.setText(text, type);
    }

    @Override
    public Typeface getTypeface()
    {
        // return Typeface.createFromAsset(ctx.getAssets(), "fonts/tahoma.ttf");
        return super.getTypeface();
    }

}
