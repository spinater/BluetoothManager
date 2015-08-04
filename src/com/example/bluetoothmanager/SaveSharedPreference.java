package com.example.bluetoothmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class SaveSharedPreference {


	static final String PRINT_MAC_ADDRESS = null;
	
	//**************Share Content*******************
	
	static SharedPreferences getSharedMacPreferences(Context cti) { //**user_id
		return PreferenceManager.getDefaultSharedPreferences(cti);
	}	
	

	//**************Set Content*******************
	public static void setMacAddress(Context cti, String strMac)  //**username
	{
		Editor editor = getSharedMacPreferences(cti).edit();
		editor.putString(PRINT_MAC_ADDRESS, strMac);
		editor.commit();
	}
	
	
	//**************Get Content*******************
	public static String getMacAddress(Context cti) //**user_id
	{
		return getSharedMacPreferences(cti).getString(PRINT_MAC_ADDRESS, "");
	}
	
	//**************Clear Content*******************
	
	public static void clearUserId(Context cti)  //**user_id
	{
		Editor editor = getSharedMacPreferences(cti).edit();
		editor.clear(); //clear all stored data
		editor.commit();
	}
	




}
