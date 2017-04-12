package deep.testmaterial;

import android.animation.Animator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.util.Pair;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import deep.testmaterial.animation.ExplodeTransitionActivity;
import deep.testmaterial.animation.FadeTransitionActivity;
import deep.testmaterial.animation.ShareElementsActivity;
import deep.testmaterial.animation.SlideTransitionActivity;
import deep.testmaterial.util.Constants;

/**
 * Created by wangfei on 17/4/11.
 */

public class Animation extends AppCompatActivity {
    ImageView img;
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置允许通过ActivityOptions.makeSceneTransitionAnimation发送或者接收Bundle
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        //设置使用TransitionManager进行动画，不设置的话系统会使用一个默认的TransitionManager
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_animation);
        img = (ImageView)findViewById(R.id.img);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
    }
    public void onClick(View view){
       // Intent animation = new Intent(Animation.this,ExplodeTransitionActivity.class);
        ActivityOptions option = ActivityOptions.makeSceneTransitionAnimation(Animation.this);
        switch (view.getId()){
            case R.id.createCircle:
                Animator animator = ViewAnimationUtils.createCircularReveal(
                    img,
                    img.getWidth()/2,
                    img.getHeight()/2,
                    img.getWidth(),
                    0);
                animator.setInterpolator(new AccelerateDecelerateInterpolator());
                animator.setDuration(2000);
                animator.start();
                break;
            case R.id.explode:
                Intent explode = new Intent(Animation.this,ExplodeTransitionActivity.class);
                getWindow().setExitTransition(new Explode().setDuration(Constants.TRANSITIONTIME));
                getWindow().setReenterTransition(new Explode().setDuration(Constants.TRANSITIONTIME));
                getWindow().setEnterTransition(new Explode().setDuration(Constants.TRANSITIONTIME));
                getWindow().setReturnTransition(new Explode().setDuration(Constants.TRANSITIONTIME));
                startActivity(explode, option.toBundle());

                break;
            case R.id.slide:
                Intent slide = new Intent(Animation.this,SlideTransitionActivity.class);
                getWindow().setExitTransition(new Slide().setDuration(Constants.TRANSITIONTIME));
                getWindow().setExitTransition(new Slide().setDuration(Constants.TRANSITIONTIME));
                getWindow().setReenterTransition(new Slide().setDuration(Constants.TRANSITIONTIME));
                getWindow().setEnterTransition(new Slide().setDuration(Constants.TRANSITIONTIME));
                getWindow().setReturnTransition(new Slide().setDuration(Constants.TRANSITIONTIME));
                startActivity(slide, option.toBundle());

                break;
            case R.id.fade:
                Intent fade = new Intent(Animation.this,FadeTransitionActivity.class);
                getWindow().setExitTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
                getWindow().setExitTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
                getWindow().setReenterTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
                getWindow().setEnterTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
                getWindow().setReturnTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
                startActivity(fade, option.toBundle());

                break;
            case R.id.shareelements:
                Intent shareelements = new Intent(Animation.this,ShareElementsActivity.class);
                getWindow().setExitTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
                getWindow().setExitTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
                getWindow().setReenterTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
                getWindow().setEnterTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
                getWindow().setReturnTransition(new Fade().setDuration(Constants.TRANSITIONTIME));
                View imageview = findViewById(R.id.img);
                View btn1 = findViewById(R.id.button1);
                View btn2 = findViewById(R.id.button2);
                View btn3 = findViewById(R.id.button3);
                Bundle bundle = ActivityOptions.makeSceneTransitionAnimation( this,
                    Pair.create(imageview,"img"),
                    Pair.create(btn1, "button1"),
                    Pair.create(btn2, "button2"),
                    Pair.create(btn3, "button3")).toBundle();
                startActivity(shareelements, bundle);
                break;

        }
    }
}
