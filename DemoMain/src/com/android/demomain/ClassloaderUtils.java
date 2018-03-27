package com.android.demomain;

import java.io.File;

import android.content.Context;
import android.util.Log;
import dalvik.system.DexClassLoader;

public class ClassloaderUtils {

	private static final String TAG = "ClassloaderUtils";

	private static DexClassLoader dexClassLoader;

	public static void init(Context context) {
		if (dexClassLoader == null) {
			Context applicationContext = context.getApplicationContext();
			Log.i(TAG, "loadDex#applicationContext:" + (applicationContext == null));
			String apkPath = AssetUtils.getApkPath(applicationContext);
			File dir = applicationContext.getDir("plugin", 0);
			dexClassLoader = new DexClassLoader(apkPath, dir.toString(), null, ClassloaderUtils.class.getClassLoader());
		}
	}

	public static DexClassLoader getDexClassLoader() {
		return dexClassLoader;
	}

}
