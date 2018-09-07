package silencer.apps.technobugs.com.silencer;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class SilencerApp extends Application{
    private final String TAG = SilencerApp.class.getSimpleName();
    private final String SHARED_PREFERENCE_NAME = "silencer.apps.technobugs.com.silencer";
    private SharedPreferences sharedPreferences;
    static SilencerApp instance;


    @Override
    public void onCreate() {
        super.onCreate();
        sharedPreferences = getSharedPreferences(SHARED_PREFERENCE_NAME, Context.MODE_PRIVATE);
        instance = this;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        if(instance!=null){
            instance=null;
        }
    }

    static SilencerApp getInstance(){
        return instance;
    }
}
