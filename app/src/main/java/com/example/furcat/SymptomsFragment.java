package com.example.furcat;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SymptomsFragment extends Fragment implements RecyclerViewInterface {
    private ArrayList<Catsymptoms> Catsymptomss = new ArrayList<>();


    public SymptomsFragment() {
        // Required empty public constructor
    }

    public static SymptomsFragment newInstance() {
        return new SymptomsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_symptom, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.mRecyclerView);
        setUpCatsymptoms();

        BB_RecyclerViewAdapter adapter = new BB_RecyclerViewAdapter(getActivity(), Catsymptomss, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }



    private void setUpCatsymptoms() {
        String[] catNames = getResources().getStringArray(R.array.Cat_Symptoms);
        String[] catDescription = getResources().getStringArray(R.array.Cat_Symptoms_desc);

        for (int i = 0; i < catNames.length; i++) {
            Catsymptomss.add(new Catsymptoms(catNames[i], catDescription[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getActivity(), MainActivity3.class);

        intent.putExtra("NAME", Catsymptomss.get(position).getCatName());
        intent.putExtra("DESCRIPTION", Catsymptomss.get(position).getDescription());

        startActivity(intent);
    }



}
