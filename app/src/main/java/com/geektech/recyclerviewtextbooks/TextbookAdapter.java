package com.geektech.recyclerviewtextbooks;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TextbookAdapter extends RecyclerView.Adapter<TextbookViewHolder> {
    private ArrayList<String> TextbookList;

    public TextbookAdapter(ArrayList<String> textbookList) {
        TextbookList = textbookList;
    }

    @NonNull
    @Override
    public TextbookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TextbookViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TextbookViewHolder holder, int position) {
        holder.bind(TextbookList.get(position));
    }

    @Override
    public int getItemCount() {
        return TextbookList.size();
    }
}
