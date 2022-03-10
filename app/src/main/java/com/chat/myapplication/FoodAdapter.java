package com.chat.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyviewHOlder>  {
    Context context;

    public FoodAdapter(Context context, ArrayList<Food> foods) {
        this.context = context;
        this.foods = foods;
    }

    ArrayList<Food>foods;
    @NonNull
    @Override
    public MyviewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View vi =LayoutInflater.from(parent.getContext()).inflate(R.layout.samplefood,parent,false);
       return  new MyviewHOlder(vi);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHOlder holder, int position) {
        Food food=foods.get(position);
        holder.img.setImageResource(food.getImage());
        holder.t1.setText(food.getText());

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public  class MyviewHOlder extends RecyclerView.ViewHolder{
ImageView img;
TextView t1;
        public MyviewHOlder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.fimageView2);
         t1=itemView.findViewById(R.id.ftextView3);
        }
    }

}

//
//Context context;
//ArrayList<Food> foods;
//
//    //constructor
//    public FoodAdapter(Context context, ArrayList<Food>foods){
//        this.context=context;
//        this.foods=foods;
//
//    }
//
//
//
//    @NonNull
//    @Override
//    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.samplefood,parent,false);
//        return new MyViewholder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
//        Food food=foods.get(position);
//        holder.img.setImageResource(food.getImage()); //int type
//        holder.t1.setText(food.getText());
//
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return foods.size();
//    }
//
//    public  class MyViewholder extends RecyclerView.ViewHolder{
//ImageView img;
//TextView t1;
//        public MyViewholder(@NonNull View itemView) {
//            super(itemView);
//            img=itemView.findViewById(R.id.fimageView2);
//            t1=itemView.findViewById(R.id.ftextView3);
//        }
//    }
//}
