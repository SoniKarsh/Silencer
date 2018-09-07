package silencer.apps.technobugs.com.silencer.utils;

import android.util.Log;

import silencer.apps.technobugs.com.silencer.BuildConfig;

public class LogUtils {
    private String tag;
    private boolean isDebugMode;

    LogUtils(String tag){
        this.tag = tag;
        this.isDebugMode = BuildConfig.DEBUG;
    }

    void d(String msg){
        if(isDebugMode){
            Log.d(tag,msg);
        }
    }

    void w(String msg){
        if(isDebugMode){
            Log.w(tag,msg);
        }
    }

    void v(String msg){
        if(isDebugMode){
            Log.v(tag,msg);
        }
    }

    void e(String msg){
        if(isDebugMode){
            Log.e(tag,msg);
        }
    }

    void i(String msg){
        if(isDebugMode){
            Log.i(tag,msg);
        }
    }

}
