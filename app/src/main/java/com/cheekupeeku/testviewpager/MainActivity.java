package com.cheekupeeku.testviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.cheekupeeku.testviewpager.databinding.HomeBinding;

public class MainActivity extends AppCompatActivity {

    HomeBinding binding;
    TabPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = HomeBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        adapter = new TabPageAdapter(getSupportFragmentManager());
        binding.veiwPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.veiwPager);
    }
}