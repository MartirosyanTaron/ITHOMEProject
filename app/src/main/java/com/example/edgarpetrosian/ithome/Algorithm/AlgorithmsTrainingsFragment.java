package com.example.edgarpetrosian.ithome.Algorithm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.edgarpetrosian.ithome.Activity.ProfileActivity;
import com.example.edgarpetrosian.ithome.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlgorithmsTrainingsFragment extends Fragment {


    public AlgorithmsTrainingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_algorithms_trainings, container, false);
    }
    public void onResume() {
        super.onResume();
        // Set title bar
        ((ProfileActivity) getActivity())
                .setActionBarTitle("Algorithms");
    }
}
