package deep.testmaterial.coordinator;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import deep.testmaterial.R;
import deep.testmaterial.TextInputActivity;

/**
 * Created by wangfei on 17/4/18.
 */

public class CollapsingActivity extends AppCompatActivity {
    private FloatingActionButton okBtn;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing);
        initToolBar();
        TextInputLayout inputWrapper = (TextInputLayout) findViewById(R.id.inputwrapper);
        editText = (EditText)findViewById(R.id.input);
        okBtn = (FloatingActionButton)findViewById(R.id.btn_ok);
        okBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                hideKeyboard();
                Snackbar mySnackbar = Snackbar.make(findViewById(R.id.main_content),editText.getText().toString(),Snackbar.LENGTH_SHORT);
                mySnackbar.setAction(editText.getText().toString(), new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CollapsingActivity.this,"click Snackbar",Toast.LENGTH_LONG).show();
                    }
                });
                mySnackbar.show();

            }
        });
        okBtn.setCompatElevation(0);
        inputWrapper.setHintAnimationEnabled(true);
        inputWrapper.setHint("请输入内容");
    }
    private void hideKeyboard() {
        View view = getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
    private void initToolBar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("CollapsingActivity");//设置标题
        toolbar.setNavigationIcon(R.mipmap.ic_launcher_round);//设置返回键，我这里没有，就有icon代替吧
        toolbar.setNavigationOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });//返回监听
        toolbar.setSubtitle("by deep");//设置副标题
    }
}
