package com.myapplicationdev.android.l06ps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Fragment f1 = new Fragment1();
        ft.replace(R.id.fragment1, f1);

        Fragment f2 = new Fragment2();
        ft.replace(R.id.fragment2, f2);


        ft.commit();

    }
}
