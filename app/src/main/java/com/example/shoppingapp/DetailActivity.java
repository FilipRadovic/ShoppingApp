package com.example.shoppingapp;

import static com.example.shoppingapp.MainActivity.EXTRA_BRAND;
import static com.example.shoppingapp.MainActivity.EXTRA_NAME;
import static com.example.shoppingapp.MainActivity.EXTRA_PRICE;
import static com.example.shoppingapp.MainActivity.EXTRA_URL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String brandName = intent.getStringExtra(EXTRA_BRAND);
        String productName = intent.getStringExtra(EXTRA_NAME);
        String price = intent.getStringExtra(EXTRA_PRICE);

        ImageView imageView = findViewById(R.id.image_view_detail);
        TextView textViewBrand = findViewById(R.id.text_view_brand_detail);
        TextView textViewName = findViewById(R.id.text_view_name_detail);
        TextView textViewPrice = findViewById(R.id.text_view_price_detail);

        Glide.with(this).load(imageUrl).into(imageView);
        textViewBrand.setText(brandName);
        textViewName.setText(productName);
        textViewPrice.setText(price);

    }
}