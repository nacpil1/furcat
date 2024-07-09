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

public class HomeFragment extends Fragment implements RecyclerViewInterface {
    private ArrayList<CatModel> catModels = new ArrayList<>();
    private int[] catImages = {
            R.drawable.persian, R.drawable.himalayan,
            R.drawable.dragonli, R.drawable.burmese,
            R.drawable.bobtaill, R.drawable.ceylon,
            R.drawable.birman, R.drawable.bengal,
            R.drawable.thaicat, R.drawable.tonkinese,
            R.drawable.suphalak, R.drawable.singapura,
            R.drawable.siberian, R.drawable.siamese,
            R.drawable.raas, R.drawable.korat,
            R.drawable.orientalshorthair, R.drawable.turkishvan,
            R.drawable.turkishangora, R.drawable.wilakrungthep,
            R.drawable.khaomanee,
    };

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.mRecyclerView);
        setUpCatModel();

        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(getActivity(), catModels, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }



    private void setUpCatModel() {
        String[] catNames = getResources().getStringArray(R.array.Cat_Breeds_txt);
        String[] catDescription = getResources().getStringArray(R.array.content_Description_txt);

        // Adding a check to prevent IndexOutOfBoundsException
        int length = Math.min(catNames.length, catImages.length);

        for (int i = 0; i < length; i++) {
            catModels.add(new CatModel(catNames[i], catImages[i % catImages.length], catDescription[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getActivity(), MainActivity2.class);

        intent.putExtra("NAME", catModels.get(position).getCatName());
        intent.putExtra("DESCRIPTION", catModels.get(position).getDescription());
        intent.putExtra("IMAGE", catModels.get(position).getImage());

        startActivity(intent);
    }

}
