package deep.testmaterial.theme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import deep.testmaterial.R;

/**
 * Created by wangfei on 17/4/13.
 */

public class TestActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testactivity);
        setTitle("TestActivity");
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

    }

    @Override
    public boolean onNavigateUp() {
        finish();
        return super.onNavigateUp();
    }
}
