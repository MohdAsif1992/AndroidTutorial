package com.educavillage.androidtutorial.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.educavillage.androidtutorial.R;


/*
  Created by faiz on 16-Jan-18.
 */

public class SqliteTabFragment extends Fragment {
    public View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
          view=inflater.inflate(R.layout.sqlite_tab_fragment,container,false);
         return view;

}
}
