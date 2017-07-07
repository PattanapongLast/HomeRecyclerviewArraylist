package com.example.pattanapong.homerecyclerviewarraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> itemList = new ArrayList<>();

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(R.layout.list_item, itemList);
        recyclerView = (RecyclerView) findViewById(R.id.item_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemArrayAdapter);

        //for(int i=1; i<10; i++) {

       //    itemList.add(new Item("หมาตัวที่ " + i));

        //}
        itemList.add(0, "หมู");
        itemList.add(0, "หมา");
        itemList.add(0, "แมว");
        itemList.add(0, "ไก่");
        itemList.add(0, "เป็ด");


    }
}
