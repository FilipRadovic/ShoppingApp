package com.example.shoppingapp;

public class Posts {

    private String image_link;
    private String brand;
    private String name;
    private String price;

    public Posts(String image_link, String brand, String name, String price) {
        this.image_link = image_link;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getImage_link() {
        return image_link;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
