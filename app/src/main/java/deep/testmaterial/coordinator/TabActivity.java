package deep.testmaterial.coordinator;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.Tab;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import deep.testmaterial.R;
import deep.testmaterial.coordinator.fragments.FirstEmptyFragment;
import deep.testmaterial.coordinator.fragments.FragmentsAdapter;
import deep.testmaterial.coordinator.fragments.NestedScrollFragment;

/**
 * Created by wangfei on 17/4/18.
 */

public class TabActivity extends AppCompatActivity{

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private NestedScrollFragment nestedFragment;
    private FirstEmptyFragment emptyFragment1,emptyFragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        initToolBar();
        initViews();
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
    private void initViews(){
        mTabLayout = (TabLayout)findViewById(R.id.tabs);
        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        nestedFragment = new NestedScrollFragment();
        emptyFragment1 = new FirstEmptyFragment();
        emptyFragment2 = new FirstEmptyFragment();
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(nestedFragment);
        fragments.add(emptyFragment1);
        fragments.add(emptyFragment2);
        ArrayList<String> titles = new ArrayList<>();
        titles.add("NestedScroll");
        titles.add("empty1");
        titles.add("empty2");
        FragmentsAdapter mAdapter = new FragmentsAdapter(getSupportFragmentManager(),fragments,titles);
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(2)));

        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager,false);
    }
}
