 package com.geektech.recyclerviewtextbooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {
    private RecyclerView TextbookRecyclerView;
    private ArrayList<String> TextbookList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextbookRecyclerView = findViewById(R.id.recycler_view);
        TextbookList.add("ФИЗИКА");
        TextbookList.add("ИСТОРИЯ КЫРГЫЗСТАНА");
        TextbookList.add("ИСТОРИЯ МИРОВАЯ");
        TextbookList.add("ФИЗИЧЕСКАЯ КУЛЬТУРА");
        TextbookList.add("КЫРГЫЗСКИЙ ЯЗЫК");
        TextbookList.add("АНГЛИЙСКИЙ ЯЗЫК");
        TextbookList.add("ДО ВОЕННАЯ ПОДГОТОВКА");
        TextbookList.add("АЛГЕБРА");
        TextbookList.add("ГЕОМЕТРИЯ");
        TextbookList.add("ЧЕРЧЕНИЕ");
        TextbookList.add("АДАБИЯТ");
        TextbookList.add("РУССКИЙ ЯЗЫК");
        TextbookList.add("ЛИТЕРАТУРА");
        TextbookList.add("БИОЛОГИЯ");
        TextbookList.add("ЕСТЕСТВОЗНАНИЕ");
        TextbookList.add("ОБЖ");
        TextbookList.add("НОВОВВЕДЕНИЕ");
        TextbookList.add("ЧЕЛОВЕК И ОБЩЕСТВО");
        TextbookList.add("НОВАЯ ИСТОРИЯ");
        TextbookList.add("МАТЕМАТИКА");
        TextbookList.add("МИФОЛОГИЯ");
        TextbookAdapter adapter = new TextbookAdapter(TextbookList);
        TextbookRecyclerView.setAdapter(adapter);

    }
}