package com.dadaabs.mrefugee.Fragments;


import android.support.v4.app.Fragment;

import com.dadaabs.mrefugee.BackPressImpl;
import com.dadaabs.mrefugee.OnBackPressListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class RootFragment extends Fragment implements OnBackPressListener {


    public RootFragment() {
        // Required empty public constructor
    }


    @Override
    public boolean onBackPressed() {
        return new BackPressImpl(this).onBackPressed();
    }

}
