package com.navig.cambioimagenv2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class MainActivity extends AppCompatActivity {
    // creating object of ViewPager
    ViewPager mViewPager;
    // images array
    int[] images = {
            R.drawable.acuario,
            R.drawable.aries,
            R.drawable.cancer,
            R.drawable.capricornio,
            R.drawable.escorpion,
            R.drawable.geminis,
            R.drawable.leo,
            R.drawable.libra,
            R.drawable.piscis,
            R.drawable.sagitario,
            R.drawable.tauro,
            R.drawable.virgo
    };

    // Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing the ViewPager Object
        mViewPager = (ViewPager) findViewById(R.id.viewPagerMain);

        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ViewPagerAdapter(MainActivity.this, images);

        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);
    }
}