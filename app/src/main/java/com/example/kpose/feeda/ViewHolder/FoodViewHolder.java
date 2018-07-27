package com.example.kpose.feeda.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kpose.feeda.Interface.ItemClickListener;
import com.example.kpose.feeda.R;

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView food_name;
    public ImageView food_image,fav_image;

    private ItemClickListener itemClickListener;


    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public FoodViewHolder(View itemView) {
        super(itemView);


        food_name = itemView.findViewById(R.id.food_name);
        food_image = itemView.findViewById(R.id.food_image);
        fav_image = itemView.findViewById(R.id.fav);

        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        itemClickListener.onClick(itemView,getAdapterPosition(),false);

    }
}
