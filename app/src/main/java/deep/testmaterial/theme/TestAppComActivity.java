package deep.testmaterial.theme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import deep.testmaterial.R;

/**
 * Created by wangfei on 17/4/13.
 */

public class TestAppComActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testappcompat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("CardView");//设置标题
        toolbar.setNavigationIcon(R.mipmap.ic_launcher_round);//设置返回键，我这里没有，就有icon代替吧
        toolbar.setNavigationOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });//返回监听
        toolbar.setLogo(R.mipmap.ic_launcher);//设置logo


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return  true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btn_first:
                Toast.makeText(this,"first",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_senond:
                Toast.makeText(this,"second",Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
