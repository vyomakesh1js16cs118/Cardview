package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleviewHolder> {
    private ArrayList<Exampleitem> mExampleList;

    public static class ExampleviewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;

        public ExampleviewHolder(@NonNull View itemView) {

            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            textView = itemView.findViewById(R.id.textView);

        }
    }

    public ExampleAdapter(ArrayList<Exampleitem> examplelist) {
        mExampleList=examplelist;
    }

    @NonNull
    @Override
    public ExampleviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.exampleitem,viewGroup,false);
        ExampleviewHolder exampleviewHolder=new ExampleviewHolder(view);
        return exampleviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleviewHolder exampleviewHolder, int i) {
        Exampleitem currentItem=mExampleList.get(i);
        exampleviewHolder.imageView.setImageResource(currentItem.getmImageResource());
        exampleviewHolder.textView.setText(currentItem.getmText());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


}


