package deep.testmaterial.coordinator.fragments;


import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import deep.testmaterial.R;
import deep.testmaterial.card.CardListAdapter;

/**
 * Created by wangfei on 17/4/19.
 */

public class NestedScrollFragment extends Fragment {
    ArrayList<String> list = new ArrayList<>();
    RecyclerView recyclerView;
    CardListAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nested, container, false);
        for (int i = 0 ; i< 200;i++){
            list.add("item:"+i);
        }
        adapter = new CardListAdapter(getActivity(),list);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_nested);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return view;
    }
}
