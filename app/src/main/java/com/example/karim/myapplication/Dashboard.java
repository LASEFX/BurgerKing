package com.example.karim.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

public class Dashboard extends Fragment {

    ImageButton imgbutton1;
    ImageButton imgbutton2;
    ImageButton imgbutton3;
    ImageButton imgbutton4;
    ImageButton imgbutton5;
    ImageButton imgbutton6;
    ImageButton imgbutton7;
    ImageButton imgbutton8;
    ImageButton imgbutton9;


    Fragment selectedFragment = null;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dashboard, null);

        imgbutton1 = view.findViewById(R.id.imgbutton);
        imgbutton2 = view.findViewById(R.id.imgbutto1);
        imgbutton3 = view.findViewById(R.id.imgbutton3);
        imgbutton4 = view.findViewById(R.id.imgbutto4);
        imgbutton5 = view.findViewById(R.id.imgbutton5);
        imgbutton6 = view.findViewById(R.id.imgbutton6);
        imgbutton7 = view.findViewById(R.id.imgbutton7);
        imgbutton8 = view.findViewById(R.id.imgbutton8);
        imgbutton9 = view.findViewById(R.id.imgbutton9);



        imgbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFragmentManager().beginTransaction().replace(R.id.fragmnet_container,
                        new Burger()).commit();
            }
        });


        imgbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFragmentManager().beginTransaction().replace(R.id.fragmnet_container,
                        new Tank()).commit();
            }
        });


        imgbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFragmentManager().beginTransaction().replace(R.id.fragmnet_container,
                        new Yader()).commit();
            }
        });





return view;

    }

}


