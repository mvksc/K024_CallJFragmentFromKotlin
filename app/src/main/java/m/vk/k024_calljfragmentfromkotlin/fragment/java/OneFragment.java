package m.vk.k024_calljfragmentfromkotlin.fragment.java;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import m.vk.k024_calljfragmentfromkotlin.R;
import m.vk.k024_calljfragmentfromkotlin.databinding.FragmentOneBinding;
import m.vk.k024_calljfragmentfromkotlin.utils.kotlin.KUtils;

public class OneFragment extends Fragment {
    private FragmentOneBinding binding;
    public OneFragment() { }
    public static OneFragment newInstance() {
        OneFragment fragment = new OneFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_one, container, false);
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        binding.tvNumber.setText(KUtils.Companion.random());//Call fun kotlin from java
    }
}
