package com.example.tablayoutwithdifferentfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tab_layout);
        viewPager=findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);
        Fragmenttabadapter fragmenttabadapter=new Fragmenttabadapter(getSupportFragmentManager(),0,this);

        Bundle bundle=new Bundle();

        BlankFragment1 blankFragment1=new BlankFragment1();
        BlankFragment2 blankFragment2=new BlankFragment2();
        BlankFragment3 blankFragment3=new BlankFragment3();
        BlankFragment3 blankFragment4=new BlankFragment3();

        bundle.putString("title1","fragment1");
        bundle.putString("title2","fragment2");
        bundle.putString("title3","fragment3");

        blankFragment1.setArguments(bundle);
        blankFragment2.setArguments(bundle);
        blankFragment3.setArguments(bundle);

        fragmenttabadapter.addfragment(blankFragment1,"frag1");
        fragmenttabadapter.addfragment(blankFragment2,"frag2");
        fragmenttabadapter.addfragment(blankFragment3,"frag3");

        
        viewPager.setAdapter(fragmenttabadapter);
    }

}