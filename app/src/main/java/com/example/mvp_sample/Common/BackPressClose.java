package com.example.mvp_sample.Common;

import android.app.Activity;
import android.widget.Toast;

import static com.google.common.base.Preconditions.checkNotNull;

public class BackPressClose extends Activity {
	private long backKeyPressedTime = 0;
	private Toast toast;
	private Activity activity;

	public BackPressClose(Activity context) {
		checkNotNull(context, "Context Is Null");
		this.activity = context;
	}

	//UI Test : onBackPressTest(); onBackPress_MsgNull_Test();
	public void onBackPressed(String str_msg) {
		if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
			backKeyPressedTime = System.currentTimeMillis();
			showGuide(str_msg);
			return;
		}
		if (System.currentTimeMillis() <= backKeyPressedTime + 2000) {
			System.exit(0);
		}
	}

	private void showGuide(String str_msg) {
		toast = Toast.makeText(activity, str_msg, Toast.LENGTH_SHORT);
		toast.show();
	}
}
