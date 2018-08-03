package com.example.quantum.college_app;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class main_page extends AppCompatActivity {
    public DrawerLayout dl;
    //public ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        dl = (DrawerLayout) findViewById(R.id.drawer_layout);
        dl.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                        // Respond when the drawer's position changes
                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {
                        // Respond when the drawer is opened
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        // Respond when the drawer is closed
                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        // Respond when the drawer motion state changes
                    }
                }
        );

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
        // abdt =new ActionBarDrawerToggle(this,dl,R.string.Open,R.string.Close);
        //abdt.setDrawerIndicatorEnabled(true);
        //dl.addDrawerListener(abdt);
        // abdt.syncState();
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_academics) {
                    startActivity(new Intent(main_page.this, academics.class));

                }
                if (id == R.id.nav_campus) {
                    startActivity(new Intent(main_page.this, campus_tour.class));

                }
                if (id == R.id.nav_gymkhana) {
                    startActivity(new Intent(main_page.this, gymkhana.class));

                }
                if (id == R.id.nav_transport) {
                    startActivity(new Intent(main_page.this, transport.class));
                }
                if (id == R.id.nav_hell) {
                    startActivity(new Intent(main_page.this, chat_support.class));

                }
                return true;

            }


        });
    }
}
