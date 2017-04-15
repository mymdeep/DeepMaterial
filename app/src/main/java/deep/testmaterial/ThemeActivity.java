package deep.testmaterial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import deep.testmaterial.theme.TestActivity;
import deep.testmaterial.theme.TestAppComActivity;

/**
 * Created by wangfei on 17/4/13.
 */

public class ThemeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_activity:
                Intent testActivity = new Intent(ThemeActivity.this,TestActivity.class);
                startActivity(testActivity);
                break;
            case R.id.btn_appcompat:
                Intent testApp = new Intent(ThemeActivity.this,TestAppComActivity.class);
                startActivity(testApp);
                break;
        }
    }
}
