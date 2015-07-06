package com.acme.dennis.circleindicator;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import me.relex.circleindicator.CircleIndicator;


public class MainActivity extends AppCompatActivity {

    PagerAdater adapter;
    ViewPager pager;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter=new PagerAdater(getSupportFragmentManager());
        pager=(ViewPager)findViewById(R.id.pager);
        pager.setAdapter(adapter);


        CircleIndicator circulos=(CircleIndicator)findViewById(R.id.indicator);
        circulos.setViewPager(pager);


    }

}
