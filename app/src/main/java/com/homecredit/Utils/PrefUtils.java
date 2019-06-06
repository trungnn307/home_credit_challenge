package com.homecredit.Utils;

import android.content.Context;
import android.content.SharedPreferences;


public class PrefUtils {
    /**
     * Storing API Key in shared preferences to
     * add it in header part of every retrofit request
     */
    public PrefUtils() {
    }

    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences("APP_PREF", Context.MODE_PRIVATE);
    }

    public static void storeToken(Context context, String token) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString("token", token);
        editor.commit();
    }

    public static String getToken(Context context) {
        return getSharedPreferences(context).getString("token", null);
    }


}
