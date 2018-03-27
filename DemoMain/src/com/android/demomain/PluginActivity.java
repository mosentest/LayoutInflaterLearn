package com.android.demomain;

import java.io.File;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import dalvik.system.DexClassLoader;

public class PluginActivity extends Activity {

	private final static String TAG = "PluginActivity";

	private IActivty act;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
		if (act != null) {
			act.onCreate(this, savedInstanceState);
		}
	}

	private void loadDex() {
		try {
			if (act == null) {
				DexClassLoader dexClassLoader = ClassloaderUtils.getDexClassLoader();
				Class<?> loadClass = dexClassLoader.loadClass("com.moziqi.demoplugin.PluginIAct");
				act = (IActivty) loadClass.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void attachBaseContext(Context newBase) {
		Log.i(TAG, "attachBaseContext");
		loadDex();
		if (act != null) {
			act.attachBaseContext(newBase);
		}
		super.attachBaseContext(newBase);
	}

	@Override
	public Object getSystemService(String name) {
		Log.i(TAG, "getSystemService>>" + name);
		if (act != null) {
			return act.getSystemService(name, super.getSystemService(name));
		} else {
			return super.getSystemService(name);
		}
	}

}
