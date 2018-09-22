package silencer.apps.technobugs.com.silencer.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    private static ToastUtils instance;

    public ToastUtils getInstance(){
        if(instance == null){
            instance = new ToastUtils();
        }
        return instance;
    }

    public void lengthLong(Context context, String string){
        Toast.makeText(context,string,Toast.LENGTH_LONG).show();
    }

    public void lengthShort(Context context, String string){
        Toast.makeText(context,string,Toast.LENGTH_SHORT).show();
    }
}
