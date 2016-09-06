package com.tacticalsandwitchstudios.ultimateslugfest;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by user on 05/09/2016.
 */
public class SavedTextPrefrences {

    private static String PREF_SAVEDTEXT = "savedtext";

    public static void setStoredText(Context context, String pref, String text){
        PREF_SAVEDTEXT = pref;
        SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PREF_SAVEDTEXT, text);
        editor.apply();
    }

    public static String getStoredText(Context context, String pref){
        PREF_SAVEDTEXT = pref;
        SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context);
        String text = sharedPreferences.getString(PREF_SAVEDTEXT, null);
        return text;
    }

    public static void removeStoredText(Context context, String pref){
        PREF_SAVEDTEXT = pref;
        SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PREF_SAVEDTEXT, null);
        editor.apply();
    }

}
