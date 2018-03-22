package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.support.v7.widget.AppCompatImageView;

/**
 * Created by Sylvana on 3/21/2018.
 */

public class FourThreeImageView extends AppCompatImageView {
    public FourThreeImageView(Context context){
        super(context);
    }
    public FourThreeImageView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
    }
    public FourThreeImageView(Context context, AttributeSet attributeSet, int defStyle){
        super(context,attributeSet,defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec){
        int threeTwoHeight = MeasureSpec.getSize(widthSpec)*3/4;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight,MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec, threeTwoHeightSpec);
    }
}

