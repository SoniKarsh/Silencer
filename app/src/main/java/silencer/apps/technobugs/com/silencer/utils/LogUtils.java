package silencer.apps.technobugs.com.silencer.utils;

// Singleton Class
// Restrict the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.

public class LogUtils {

    private String TAG = "TAG";

    private static LogUtils instance;

    // Private Constructor
    private LogUtils(){

    }

    public static LogUtils getInstance(){
        if(instance == null){
            instance = new LogUtils();
        }
        return instance;
    }

    public void setTag(String TAG){
        LogUtils.instance.TAG = TAG;
    }

}
