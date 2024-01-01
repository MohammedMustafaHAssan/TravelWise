package com.example.TravelWise.Activities;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.TravelWise.Adapters.CategoAdapter;
import com.example.TravelWise.Adapters.PopAdapter;
import com.example.TravelWise.Domains.CategoDomain;
import com.example.TravelWise.Domains.PopDomain;
import com.example.TravelWise.R;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPopular, adapterCat;
    private RecyclerView recyclerViewPopular, recyclerViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<PopDomain> items = new ArrayList<>();
        items.add(new PopDomain("Mar caible, avendia lago",
                "Miami Beach", "This 2 bed /1 bath home boasts an enormous," +
                " open-living plan, accented by striking " +
                "architectural features and high-end finishes." +
                " Feel inspired by open sight lines that" +
                " embrace the outdoors, crowned by stunning" +
                " coffered ceilings. ", 2, true, 4.8, "pic1", true, 1000));
        items.add(new PopDomain("Passo Rolle, TN", "Hawaii Beach",
                "This 2 bed /1 bath home boasts an enormous," +
                " open-living plan, accented by striking " +
                "architectural features and high-end finishes." +
                " Feel inspired by open sight lines that" +
                " embrace the outdoors, crowned by stunning" +
                " coffered ceilings. ", 1, false, 5, "pic2", false, 2500));
        items.add(new PopDomain("Mar caible, avendia lago", "Miami Beach",
                "This 2 bed /1 bath home boasts an enormous," +
                " open-living plan, accented by striking " +
                "architectural features and high-end finishes." +
                " Feel inspired by open sight lines that" +
                " embrace the outdoors, crowned by stunning" +
                " coffered ceilings. ", 3, true, 4.3, "pic3", true, 30000));

        recyclerViewPopular = findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));
        adapterPopular = new PopAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);


        ArrayList<CategoDomain> catsList = new ArrayList<>();
        catsList.add(new CategoDomain("Beaches", "cat1"));
        catsList.add(new CategoDomain("Camps", "cat2"));
        catsList.add(new CategoDomain("Forest", "cat3"));
        catsList.add(new CategoDomain("Desert", "cat4"));
        catsList.add(new CategoDomain("Mountain", "cat5"));


        recyclerViewCategory = findViewById(R.id.view_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));
        adapterCat = new CategoAdapter(catsList);
        recyclerViewCategory.setAdapter(adapterCat);


    }
}