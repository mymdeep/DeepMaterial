package deep.testmaterial;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by wangfei on 17/4/18.
 */

public class TextInputActivity extends AppCompatActivity {
    private FloatingActionButton okBtn;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textinput);

         TextInputLayout inputWrapper = (TextInputLayout) findViewById(R.id.inputwrapper);
        editText = (EditText)findViewById(R.id.input);
        okBtn = (FloatingActionButton)findViewById(R.id.btn_ok);
        okBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                hideKeyboard();
                Snackbar mySnackbar = Snackbar.make(findViewById(R.id.myCoordinatorLayout),editText.getText().toString(),Snackbar.LENGTH_SHORT);
                mySnackbar.setAction(editText.getText().toString(), new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TextInputActivity.this,"click Snackbar",Toast.LENGTH_LONG).show();
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
}
