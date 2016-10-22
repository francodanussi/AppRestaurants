package com.example.diagnostifo.integradordanussioctubre;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPagerMainActivity);
        AdapterDeRestaurants adapterDeRestaurants = new AdapterDeRestaurants(getSupportFragmentManager());
        viewPager.setAdapter(adapterDeRestaurants);
        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(12);

        NavigationView unNavigationView = (NavigationView)findViewById(R.id.navigation_view);
        ListenerNavigationView unListenerNavigationView = new ListenerNavigationView();
        unNavigationView.setNavigationItemSelectedListener(unListenerNavigationView);
}

    public void pasarAOtroActivity(){
        Intent esteintent = new Intent(this, OtroActivity.class);
        startActivity(esteintent);
    }
private class ListenerNavigationView implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        pasarAOtroActivity();
        return true;
    }
}
}
