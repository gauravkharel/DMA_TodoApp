package com.example.todomvvm.tasks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todomvvm.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactFragment} factory method to
 * create an instance of this fragment.
 */
public class ContactFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        return inflater.inflate(R.layout.contactlayout, viewGroup, false);
    }
}