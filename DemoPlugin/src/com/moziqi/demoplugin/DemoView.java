package com.moziqi.demoplugin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

public class DemoView extends View {

	public DemoView(Context context) {
		super(context);
	}

	public DemoView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public DemoView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		setBackgroundColor(Color.BLACK);
		Toast.makeText(getContext(), "aaa", Toast.LENGTH_SHORT).show();
	}
}
