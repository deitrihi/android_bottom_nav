package com.deitrihi.combinetest;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends FragmentActivity{

    private Fragment studioFragment;
    private Fragment settingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottom_menu = findViewById(R.id.bottom_menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_frame, new StudioFragment()).commit();
        bottom_menu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                  @Override
                  public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                      Log.d("navigation_item : ", item.getTitle().toString());
                        if ( item.getItemId() == R.id.action_studio) {
                            changeFragment(new StudioFragment());
                        } else if ( item.getItemId() == R.id.action_setting) {
                            changeFragment(new SettingFragment());
                        }
                      return true;
                  }
              }
        );
    }

    public void changeFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_frame, fragment).commit();
    }
}