package m.vk.k024_calljfragmentfromkotlin.fragment.java;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import m.vk.k024_calljfragmentfromkotlin.R;
import m.vk.k024_calljfragmentfromkotlin.databinding.FragmentThreeBinding;
import m.vk.k024_calljfragmentfromkotlin.utils.kotlin.KUtils;

public class ThreeFragment extends Fragment {

    private FragmentThreeBinding binding;
    public ThreeFragment() { }
    public static ThreeFragment newInstance() {
        ThreeFragment fragment = new ThreeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_three, container, false);
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        binding.tvNumber.setText(KUtils.Companion.random());//Call fun kotlin from java
    }
}
