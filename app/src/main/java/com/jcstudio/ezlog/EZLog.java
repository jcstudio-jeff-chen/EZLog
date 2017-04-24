package com.jcstudio.ezlog;

import android.util.Log;

/**
 * Created by jeffrey on 2017/4/24.
 *
 * 無需指定 tag 的便利型 Log 函數。
 *
 */

public class EZLog {
    public static String messageTag = "[訊息]";
    public static String warningTag = "[警告]";
    public static String errorTag = "[錯誤]";
    public static void printMessage(String message){
        Log.d(messageTag, message);
    }
    public static void printWarning(String message){
        Log.w(warningTag, message);
    }
    public static void printError(String message){
        Log.e(errorTag, message);
    }
}
