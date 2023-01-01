package com.deitrihi.combinetest;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudioFragment extends Fragment {

    public StudioFragment() {
        // Required empty public constructor
    }

    public static StudioFragment newInstance() {
        StudioFragment fragment = new StudioFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    // 메모리에 올라왔을 때.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    // Fragment를 안고 있는 액티비티에 붙었을 때.
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    // 떨어졌을 떄?
    @Override
    public void onDetach() {
        super.onDetach();

    }

    // View가 생성 되었을 때 -> setContentView와 비슷.
    // Fragment와 레이아웃을 연결 시켜주는 부분.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_studio, container, false);
        WebView webView = view.findViewById(R.id.webView);

        webView.loadUrl("https://m.naver.com");

        return view;
    }
}