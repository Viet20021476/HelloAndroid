package UtilP;

import android.view.animation.AlphaAnimation;
import android.widget.TextView;

public class Util {
    public static void animation(TextView tv) {
        AlphaAnimation dis = new AlphaAnimation(1.0f, 0.0f);
        tv.startAnimation(dis);
        dis.setDuration(2000);
    }
}
