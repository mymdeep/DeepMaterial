package deep.testmaterial.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.view.Window;
import deep.testmaterial.R;
import deep.testmaterial.util.Constants;

/**
 * Created by wangfei on 17/4/12.
 */

public class ShareElementsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置允许通过ActivityOptions.makeSceneTransitionAnimation发送或者接收Bundle
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        //设置使用TransitionManager进行动画，不设置的话系统会使用一个默认的TransitionManager
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_shareele);
        getWindow().setExitTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
        getWindow().setReenterTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
        getWindow().setEnterTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
        getWindow().setReturnTransition(new Fade().setDuration(Constants.TRANSITIONTIME));

    }
}
