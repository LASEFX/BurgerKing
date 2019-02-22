package com.example.karim.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class HomeFragment extends Fragment implements OnMapReadyCallback  {

    GoogleMap map;

    SupportMapFragment mapFragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);

        mapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        if(mapFragment == null){
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            mapFragment = SupportMapFragment.newInstance();
            ft.replace(R.id.map, mapFragment).commit();
        }
        mapFragment.getMapAsync(this);



        return view;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;

        LatLng magazine = new LatLng(55.771751, 38.448196);
        LatLng shop = new LatLng(55.812818, 38.430236);

        map.addMarker(new MarkerOptions().position(magazine).title("Burger King"));
        map.moveCamera(CameraUpdateFactory.newLatLng(magazine));
        map.addMarker(new MarkerOptions().position(shop).title("Burger King"));
        map.moveCamera(CameraUpdateFactory.newLatLng(shop));

    }
}
