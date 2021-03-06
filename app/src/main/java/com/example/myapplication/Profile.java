package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

public class Profile extends Fragment {
    private RadioButton radioPemilik;
    public Profile() {
        // Required empty public constructor
    }
    public static Profile newInstance() {
        Profile fragment = new Profile();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((Homepage) getActivity()).setActionBar("Profile");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        radioPemilik = rootView.findViewById(R.id.profile_radio_pemilik);
        radioPemilik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Homepage) getActivity()).getFragmentPage(new ProfilePemilik());
            }
        });
        // Inflate the layout for this fragment
        return rootView;

    }
}