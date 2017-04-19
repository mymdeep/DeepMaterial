package deep.testmaterial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import deep.testmaterial.coordinator.CollapsingActivity;
import deep.testmaterial.coordinator.TabActivity;

/**
 * Created by wangfei on 17/4/18.
 */

public class CoordinatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);

    }
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.tab_btn:
                Intent animation = new Intent(CoordinatorActivity.this,TabActivity.class);
                startActivity(animation);
                break;
            case R.id.collapsing_btn:
                Intent theme = new Intent(CoordinatorActivity.this,CollapsingActivity.class);
                startActivity(theme);
                break;

        }
    }
}
