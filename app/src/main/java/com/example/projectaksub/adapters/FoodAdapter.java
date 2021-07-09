package com.example.projectaksub.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.projectaksub.R;
import com.example.projectaksub.models.Food;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.viewHolder>{

    ArrayList<Food> foodArrayList;
    Context context;
    public FoodAdapter(Context context, ArrayList<Food> foodArrayList){
        this.context = context;
        this.foodArrayList = foodArrayList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_foods, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.viewHolder holder, int position) {
        Food food = foodArrayList.get(position);
        holder.tvFoodName.setText(food.getFoodName());
        holder.ivTumbnail.setImageResource(food.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        ImageView ivTumbnail;
        TextView tvFoodName;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            ivTumbnail =  itemView.findViewById(R.id.iv_thumbnail);
            tvFoodName = itemView.findViewById(R.id.tv_food_name);
        }
    }
}
