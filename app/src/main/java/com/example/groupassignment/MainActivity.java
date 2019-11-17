package com.example.groupassignment;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager1 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
        StudyFragment studyfragment = new StudyFragment();
        fragmentTransaction1.replace(R.id.frameLayout, studyfragment);
        fragmentTransaction1.commit();


        BottomNavigationView navView = findViewById(R.id.bottomNavigationView);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.Study:
                        FragmentManager fragmentManager1 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                        StudyFragment studyfragment = new StudyFragment();
                        fragmentTransaction1.replace(R.id.frameLayout, studyfragment);
                        fragmentTransaction1.commit();
                        break;

                    case R.id.Quiz:
                        FragmentManager fragmentManager2 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                        QuizFragment quizfragment = new QuizFragment();
                        fragmentTransaction2.replace(R.id.frameLayout, quizfragment);
                        fragmentTransaction2.commit();
                        break;

                    case R.id.Level:
                        FragmentManager fragmentManager3 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
                        LevelFragment rankFragment = new LevelFragment();
                        fragmentTransaction3.replace(R.id.frameLayout, rankFragment);
                        fragmentTransaction3.commit();
                        break;

                    case R.id.Note:
                        FragmentManager fragmentManager4 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction4 = fragmentManager4.beginTransaction();
                        NoteFragment noteFragment = new NoteFragment();
                        fragmentTransaction4.replace(R.id.frameLayout, noteFragment);
                        fragmentTransaction4.commit();

                }
                return true;
            }
        });


    }
}
