package deep.testmaterial.coordinator.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import deep.testmaterial.R;

/**
 * Created by wangfei on 17/4/19.
 */

public class NestedScrollFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nested, container, false);



        return view;
    }
}
