package silencer.apps.technobugs.com.silencer.utils;

import android.util.Log;

import silencer.apps.technobugs.com.silencer.BuildConfig;

public class LogUtils {
    private String TAG;
    private boolean isDebugMode;
    private static LogUtils instance;

    public static LogUtils getInstance(String tag){
        if(instance == null){
            instance = new LogUtils();
            instance.isDebugMode = BuildConfig.DEBUG;
        }
        instance.TAG = tag;
        return instance;
    }


    void d(String msg){
        if(isDebugMode){
            Log.d(TAG,msg);
        }
    }

    void w(String msg){
        if(isDebugMode){
            Log.w(TAG,msg);
        }
    }

    void v(String msg){
        if(isDebugMode){
            Log.v(TAG,msg);
        }
    }

    void e(String msg){
        if(isDebugMode){
            Log.e(TAG,msg);
        }
    }

    void i(String msg){
        if(isDebugMode){
            Log.i(TAG,msg);
        }
    }

}
