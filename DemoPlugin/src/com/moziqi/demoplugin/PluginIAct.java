package com.moziqi.demoplugin;

import java.lang.reflect.Field;

import com.android.demomain.IActivty;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PluginIAct implements IActivty {

	private LayoutInflater mLayoutInflater;

	private Context baseContext;

	private Activity that;

	private Resources mResources;

	// Content View Elements

	private TextView mTv;
	private FrameLayout mFl;
	private com.moziqi.demoplugin.DemoView mDemoview;

	// End Of Content View Elements

	private void bindViews() {

		mTv = (TextView) that.findViewById(R.id.tv);
		mFl = (FrameLayout) that.findViewById(R.id.fl);
		mDemoview = (com.moziqi.demoplugin.DemoView) that.findViewById(R.id.demoview);
	}

	@Override
	public void attachBaseContext(Context context) {
		baseContext = context;
		mResources = BundlerResourceLoader.getBundleResource(baseContext);
		replaceContextResources(baseContext);
	}

	@Override
	public Object getSystemService(String name, Object superObject) {
		if (superObject instanceof LayoutInflater) {
			if (mLayoutInflater == null) {
				mLayoutInflater = ((LayoutInflater) superObject).cloneInContext(baseContext);
				InflaterFactory factory = new InflaterFactory(mLayoutInflater.getFactory(), PluginIAct.class.getClassLoader());
				mLayoutInflater.setFactory(factory);
			}
			return mLayoutInflater;
		}
		return superObject;
	}

	@Override
	public void onCreate(Activity activity, Bundle savedInstanceState) {
		that = activity;
		initView();
	}

	public void initView() {
		that.setContentView(R.layout.activity_main);
		bindViews();
		mDemoview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(that, "a", Toast.LENGTH_SHORT).show();
			}
		});
	}

	/**
	 * 使用反射的方式，使用Bundle的Resource对象，替换Context的mResources对象
	 * 
	 * @param context
	 */
	public void replaceContextResources(Context context) {
		try {
			Field field = context.getClass().getDeclaredField("mResources");
			field.setAccessible(true);
			field.set(context, mResources);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
