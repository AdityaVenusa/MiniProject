package id.ac.polinema.miniproject.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.miniproject.R;
import id.ac.polinema.miniproject.fragment.FragmentData;
import id.ac.polinema.miniproject.fragment.FragmentInput;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentListTitle = new ArrayList<>();


    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitle.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentListTitle.add(title);
    }
}
