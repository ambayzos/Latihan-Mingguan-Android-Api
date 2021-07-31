package com.example.latihan.belajarretrofit.entity;

import com.google.gson.annotations.SerializedName;

public class EntityProduct {
    @SerializedName("id")
    private Long id;
    @SerializedName("namaProduct")
    private String namaProduct;
    @SerializedName("price")
    private int price;
    @SerializedName("description")
    private String description;
    @SerializedName("variant")
    private String variant;
    @SerializedName("image_url")
    private String image_url;

    public EntityProduct(Long id, String namaProduct, int price, String description, String variant, String image_url) {
        this.id = id;
        this.namaProduct = namaProduct;
        this.price = price;
        this.description = description;
        this.variant = variant;
        this.image_url = image_url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaProduct() {
        return namaProduct;
    }

    public void setNamaProduct(String namaProduct) {
        this.namaProduct = namaProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
