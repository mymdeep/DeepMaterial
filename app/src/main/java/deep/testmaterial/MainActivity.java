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
        //setSupportActionBar(toolbar);
    }
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.animation:
                Intent animation = new Intent(MainActivity.this,Animation.class);
                startActivity(animation);
                break;

        }
    }
}
