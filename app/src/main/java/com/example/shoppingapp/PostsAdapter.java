package com.example.shoppingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    private List<Posts> postsList;
    Context context;

    public PostsAdapter(List<Posts> postsList, Context context) {
        this.postsList = postsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(this.context).load(postsList.get(position).getImage_link()).into(holder.imageView);
        holder.tvBrand.setText(postsList.get(position).getBrand());
        holder.tvName.setText(postsList.get(position).getName());
        holder.tvPrice.setText(postsList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvBrand;
        TextView tvName;
        TextView tvPrice;


        public ViewHolder(@NonNull View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvBrand = itemView.findViewById(R.id.tvBrand);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
        }

    }


}
