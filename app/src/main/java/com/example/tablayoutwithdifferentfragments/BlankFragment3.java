package com.example.tablayoutwithdifferentfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment3 extends Fragment {

    private TextView textView;
    public BlankFragment3() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank3, container, false);
        textView=view.findViewById(R.id.textviewf3);
        if(getArguments()!=null)
        {
            textView.setText(getArguments().getString("title3"));
        }
        return view;
    }
}