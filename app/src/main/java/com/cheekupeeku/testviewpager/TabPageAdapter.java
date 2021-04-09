package com.cheekupeeku.testviewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPageAdapter extends FragmentPagerAdapter {
  public TabPageAdapter(FragmentManager manager){
      super(manager);
  }

    @NonNull
    @Override
    public Fragment getItem(int position) {
      Fragment fragment=null;
      if(position == 0)
          fragment = new ChatFragment();
      else if(position == 1)
          fragment = new StatusFragment();
      else if(position == 2)
          fragment = new CallsFragment();
      return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
      String tabTitle="";
      if(position ==0)
          tabTitle = "CHAT";
      else if(position == 1)
          tabTitle = "STATUS";
      else if(position == 2)
          tabTitle = "CALLS";
      return tabTitle;
    }
}
