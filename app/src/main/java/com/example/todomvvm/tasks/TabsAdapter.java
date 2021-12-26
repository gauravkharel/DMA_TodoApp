package com.example.todomvvm.tasks;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){

            case 0:
                AboutFragment about = new AboutFragment();
                return about;
            case 1:
                ContactFragment contact = new ContactFragment();
                return contact;
            default:
                return null;
        }
    }
}
