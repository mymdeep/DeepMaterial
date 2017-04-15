package deep.testmaterial;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.RecyclerListener;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import deep.testmaterial.card.CardListAdapter;

/**
 * Created by wangfei on 17/4/15.
 */

public class CardActivity extends AppCompatActivity {
    ArrayList<String> list = new ArrayList<>();
    RecyclerView recyclerView;
    CardListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("RecyclerView");//设置标题
        toolbar.setNavigationIcon(R.mipmap.ic_launcher_round);//设置返回键，我这里没有，就有icon代替吧
        toolbar.setNavigationOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });//返回监听
        toolbar.setSubtitle("CardView");//设置副标题
        for (int i = 0 ; i< 200;i++){
            list.add("item:"+i);
        }
        adapter = new CardListAdapter(this,list);
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

}
