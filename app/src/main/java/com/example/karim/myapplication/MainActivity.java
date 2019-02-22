package com.example.karim.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       BottomNavigationView bottom  =findViewById(R.id.navigation);
       bottom.setOnNavigationItemSelectedListener(navListener);

       getSupportFragmentManager().beginTransaction().replace(R.id.fragmnet_container,
               new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch(menuItem.getItemId()){
                        case R.id.navigation_dashboard:
                            selectedFragment = new Dashboard();
                            break;
                        case R.id.navigation_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.navigation_notifications:
                            selectedFragment = new Cupons();
                            break;
                        case R.id.navigation_sales:
                            selectedFragment = new Sales();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmnet_container,
                            selectedFragment).commit();
                    return  true;

                }
            };

}
