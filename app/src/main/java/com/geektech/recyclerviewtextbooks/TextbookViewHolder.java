package com.geektech.recyclerviewtextbooks;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TextbookViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTextBook;
    public TextbookViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTextBook = itemView.findViewById(R.id.Textbook_TV);
    }
    public void bind (String menu){
        tvTextBook.setText(menu);
    }
}
