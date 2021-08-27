package com.example.madproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class SanjeevAdapter extends ArrayAdapter<String> {

    private String[] arr;
    public SanjeevAdapter(@NonNull Context context, int resource, @NonNull String[] arr ) {
        super(context, resource, arr);
        this.arr =arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.question_layout,parent, false);
        TextView t= convertView.findViewById(R.id.bookname);
        t.setText(getItem(position));

        return convertView;
    }
}

