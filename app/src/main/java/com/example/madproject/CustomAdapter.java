package com.example.madproject;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    public book[] localDataSet;
    public TextView textView;
    public TextView textView2;



    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public ViewHolder(View view) {

            super(view);


            textView = (TextView) view.findViewById(R.id.bookname);
        }

        public TextView getTextView() {
            return textView;
        }
    }



    public CustomAdapter(book[] dataSet) {
        localDataSet = dataSet;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.book_layout, viewGroup, false);
        textView = view.findViewById(R.id.bookname);
        textView2 = view.findViewById(R.id.bookauthor);
        return new ViewHolder(view);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }





    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {


        textView.setText(localDataSet[position].Book_name);
        textView2.setText(localDataSet[position].Book_author);

    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }

}
