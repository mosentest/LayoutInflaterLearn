package com.android.demomain;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public interface IActivty {

	public void onCreate(Activity activity, Bundle savedInstanceState);

	public void attachBaseContext(Context newBase);

	public Object getSystemService(String name, Object superObject);
}
