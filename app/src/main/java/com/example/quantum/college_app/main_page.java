package com.example.quantum.college_app;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class main_page extends AppCompatActivity {
    public DrawerLayout dl;
    public ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
                dl =(DrawerLayout)findViewById(R.id.dl);
                abdt =new ActionBarDrawerToggle(this,dl,R.string.Open,R.string.Close);
                abdt.setDrawerIndicatorEnabled(true);
                dl.addDrawerListener(abdt);
                abdt.syncState();
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView nav_view =(NavigationView)findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_academics) {

                }
                if (id == R.id.nav_campus) {

                }
                if (id == R.id.nav_gymkhana) {

                }
                if (id == R.id.nav_transport) {
                }
                if (id == R.id.nav_hell) {

                }
                return true;
            }
        });

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return abdt.onOptionsItemSelected(item)||super.onOptionsItemSelected(item);
    }
}
