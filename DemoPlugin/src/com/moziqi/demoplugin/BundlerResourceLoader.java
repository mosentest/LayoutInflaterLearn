package com.moziqi.demoplugin;

import java.io.File;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

public class BundlerResourceLoader {

	private final static String FILE_PATH = "plugin_apk";

	private final static String PLUGIN_APK = "DemoPlugin.apk";

	private static AssetManager createAssetManager(String apkPath) {
		try {
			AssetManager assetManager = AssetManager.class.newInstance();
			try {
				AssetManager.class.getDeclaredMethod("addAssetPath", String.class).invoke(assetManager, apkPath);
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return assetManager;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取Bundle中的资源
	 * 
	 * @param context
	 * @param apkPath
	 * @return
	 */
	public static Resources getBundleResource(Context context) {
		String apkPath = getApkPath(context);
		AssetManager assetManager = createAssetManager(apkPath);
		Resources resources = context.getResources();
		return new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
	}

	public static String getApkPath(Context context) {
		File dir = context.getDir(FILE_PATH, Context.MODE_PRIVATE);
		String apkPath = dir.getAbsolutePath() + "/" + PLUGIN_APK;
		return apkPath;
	}
}