package deep.testmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.animation_btn:
                Intent animation = new Intent(MainActivity.this,Animation.class);
                startActivity(animation);
                break;
            case R.id.theme_btn:
                Intent theme = new Intent(MainActivity.this,ThemeActivity.class);
                startActivity(theme);
                break;
            case R.id.card_btn:
                Intent card = new Intent(MainActivity.this,CardActivity.class);
                startActivity(card);
                break;
            case R.id.coordinator:
                Intent coordinator = new Intent(MainActivity.this,CoordinatorActivity.class);
                startActivity(coordinator);
                break;
            case R.id.nested:
                Intent nested = new Intent(MainActivity.this,NestedScrollViewActivity.class);
                startActivity(nested);
                break;
        }
    }
}
