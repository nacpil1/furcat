package com.example.furcat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link pregnancyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class pregnancyFragment extends Fragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Button catpregnancy = view.findViewById(R.id.catpregnancy);
        Button Inheat = view.findViewById(R.id.Inheat);
        Button duringpregnancys = view.findViewById(R.id.duringpregnancys);
        Button givingbirth = view.findViewById(R.id.givingbirth);


        catpregnancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getActivity() != null) {
                    Intent intent = new Intent(getActivity(), catpregnancyActivity.class);
                    startActivity(intent);
                }
            }
        });

        Inheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getActivity() != null) {
                    Intent intent = new Intent(getActivity(), inheatActivity.class);
                    startActivity(intent);
                }
            }
        });

        duringpregnancys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getActivity() != null) {
                    Intent intent = new Intent(getActivity(), duringActivity.class);
                    startActivity(intent);
                }
            }
        });

        givingbirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getActivity() != null) {
                    Intent intent = new Intent(getActivity(), givingbirthActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

        // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public pregnancyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment pregnancyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static pregnancyFragment newInstance(String param1, String param2) {
        pregnancyFragment fragment = new pregnancyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pregnancy, container, false);
    }
}