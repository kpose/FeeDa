package com.example.kpose.feeda.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kpose.feeda.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtMenuName;
    public ImageView imageView;

    private AdapterView.OnItemClickListener onItemClickListener;


   /* public  MenuViewHolder(View itemView) {
        super(itemView);

        txtMenuName = (TextView)itemView.findViewById(R.id.menu_name);
        imageView = itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);

    }*/

    public MenuViewHolder(View view) {
        super(view);
        view.setOnClickListener(this);
        txtMenuName = itemView.findViewById(R.id.menu_name);
        imageView = itemView.findViewById(R.id.menu_image);
    }



    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    /*@Override
    public void onClick(View v) {
        Log.d("RecyclerView", "onClick：" + getLayoutPosition());

    }*/

    @Override
    public  void onClick(View view){
        Log.d("RecyclerView","onClick " + getLayoutPosition()+ " " + txtMenuName);
    }
}
