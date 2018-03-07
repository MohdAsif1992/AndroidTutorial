package com.educavillage.androidtutorial.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.educavillage.androidtutorial.R;

/**
 * Created by faiz on 16-Jan-18.
 */

public class InterviewQATabFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.interview_question_answer_tab_fragment,null);
        return rootView;
    }
}
