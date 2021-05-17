package must.ac.csce.OUTA.outasamsonprogcolorswap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String msge = intent.getStringExtra("message");

        if(intent.getAction().equals("com.must.ac.csce.outasamson.xmlcolorswap")) {

            Toast.makeText(context, "" + msge, Toast.LENGTH_SHORT).show();
        }
    }
}
