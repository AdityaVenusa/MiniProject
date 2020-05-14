package id.ac.polinema.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import id.ac.polinema.miniproject.adapter.TabsPagerAdapter;
import id.ac.polinema.miniproject.fragment.FragmentData;
import id.ac.polinema.miniproject.fragment.FragmentInput;

public class DataActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        appBarLayout = (AppBarLayout) findViewById(R.id.appBar);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabsPagerAdapter adapter = new TabsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentData(), "Data Guru");
        adapter.addFragment(new FragmentInput(), "Input");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
