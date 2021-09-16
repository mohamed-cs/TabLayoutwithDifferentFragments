package com.example.tablayoutwithdifferentfragments;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class Fragmenttabadapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragmentslist=new ArrayList<>();
    ArrayList<String> fragmenttitlelist=new ArrayList<>();

    private final Context mContext;

    public Fragmenttabadapter(@NonNull FragmentManager fm, int behavior, Context mContext) {
        super(fm, behavior);
        this.mContext = mContext;
    }

    public void addfragment(Fragment fragment, String Title)
    {
        fragmentslist.add(fragment);
        fragmenttitlelist.add(Title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentslist.get(position);
    }

    @Override
    public int getCount() {
        return fragmentslist.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmenttitlelist.get(position);
    }
}
