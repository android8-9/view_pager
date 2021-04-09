package com.cheekupeeku.testviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.cheekupeeku.testviewpager.databinding.CallsBinding;


public class CallsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        CallsBinding binding = CallsBinding.inflate(LayoutInflater.from(getActivity()));
        return binding.getRoot();
    }
}
