package deep.testmaterial;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import deep.testmaterial.card.CardListAdapter;
import deep.testmaterial.coordinator.fragments.FirstEmptyFragment;
import deep.testmaterial.coordinator.fragments.FragmentsAdapter;
import deep.testmaterial.coordinator.fragments.NestedScrollFragment;

/**
 * Created by wangfei on 17/4/24.
 */

public class NestedScrollViewActivity  extends AppCompatActivity {
    ArrayList<String> list = new ArrayList<>();
    RecyclerView recyclerView;
    CardListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested);
        initToolBar();
        initViews();
    }
    private void initToolBar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("NestedScrollViewActivity");//设置标题
        toolbar.setNavigationIcon(R.mipmap.ic_launcher_round);//设置返回键，我这里没有，就有icon代替吧
        toolbar.setNavigationOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });//返回监听
        toolbar.setSubtitle("by deep");//设置副标题
    }
    private void initViews(){
        //for (int i = 0 ; i< 200;i++){
        //    list.add("item:"+i);
        //}
        //adapter = new CardListAdapter(this,list);
        //recyclerView = (RecyclerView)findViewById(R.id.recycler_nested);
        //recyclerView.setAdapter(adapter);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
