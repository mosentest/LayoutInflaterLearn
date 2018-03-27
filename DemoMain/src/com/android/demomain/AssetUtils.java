package com.android.demomain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.os.MemoryFile;

public class AssetUtils {

	private final static String FILE_PATH = "plugin_apk";

	private final static String PLUGIN_APK = "DemoPlugin.apk";

	public static String getApkPath(Context context) {
		File dir = context.getDir(FILE_PATH, Context.MODE_PRIVATE);
		String apkPath = dir.getAbsolutePath() + "/" + PLUGIN_APK;
		return apkPath;
	}

	public static void copyAssets(Context context) {
		String apkPath = getApkPath(context);
		InputStream is = null;
		MemoryFile mf = null;
		FileOutputStream fos = null;
		try {
			is = context.getAssets().open(PLUGIN_APK);
			/**
			 * 不熟，但是厉害的人，都会用
			 * https://blog.csdn.net/wzgiceman/article/details/50610969
			 */
			MemoryFile memoryFile = new MemoryFile(apkPath, is.available());
			memoryFile.allowPurging(false);
			File file = new File(apkPath);
			fos = new FileOutputStream(file);
			byte[] buffer = new byte[1024];
			int byteCount = 0;
			while ((byteCount = is.read(buffer)) != -1) {// 循环从输入流读取
				// buffer字节
				fos.write(buffer, 0, byteCount);// 将读取的输入流写入到输出流
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (fos != null) {
					fos.close();
				}
				if (mf != null) {
					mf.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void copyFilesFromAssets(Context context, String assetsPath, String savePath) {
		try {
			String fileNames[] = context.getAssets().list(assetsPath);// 获取assets目录下的所有文件及目录名
			if (fileNames.length > 0) {// 如果是目录
				File file = new File(savePath);
				file.mkdirs();// 如果文件夹不存在，则递归
				for (String fileName : fileNames) {
					copyFilesFromAssets(context, assetsPath + "/" + fileName, savePath + "/" + fileName);
				}
			} else {// 如果是文件
				InputStream is = context.getAssets().open(assetsPath);
				FileOutputStream fos = new FileOutputStream(new File(savePath));
				byte[] buffer = new byte[1024];
				int byteCount = 0;
				while ((byteCount = is.read(buffer)) != -1) {// 循环从输入流读取
					// buffer字节
					fos.write(buffer, 0, byteCount);// 将读取的输入流写入到输出流
				}
				fos.flush();// 刷新缓冲区
				is.close();
				fos.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}