package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

public class ProfilePemilik extends Fragment {
    RadioButton radioPenyewa;
    public ProfilePemilik() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static ProfilePemilik newInstance(String param1, String param2) {
        ProfilePemilik fragment = new ProfilePemilik();
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
        View rootView = inflater.inflate(R.layout.fragment_profile_pemilik, container, false);
        radioPenyewa = rootView.findViewById(R.id.profilepemilik_radio_penyewa);
        radioPenyewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Homepage) getActivity()).getFragmentPage(new Profile());
            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }
}