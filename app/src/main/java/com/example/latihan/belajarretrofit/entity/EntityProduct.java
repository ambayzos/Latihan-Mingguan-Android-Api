package com.example.latihan.belajarretrofit.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EntityProduct implements Parcelable {
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

    public EntityProduct() {
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.namaProduct);
        dest.writeInt(this.price);
        dest.writeString(this.description);
        dest.writeString(this.variant);
        dest.writeString(this.image_url);
    }

    public void readFromParcel(Parcel source) {
        this.id = (Long) source.readValue(Long.class.getClassLoader());
        this.namaProduct = source.readString();
        this.price = source.readInt();
        this.description = source.readString();
        this.variant = source.readString();
        this.image_url = source.readString();
    }

    protected EntityProduct(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.namaProduct = in.readString();
        this.price = in.readInt();
        this.description = in.readString();
        this.variant = in.readString();
        this.image_url = in.readString();
    }

    public static final Parcelable.Creator<EntityProduct> CREATOR = new Parcelable.Creator<EntityProduct>() {
        @Override
        public EntityProduct createFromParcel(Parcel source) {
            return new EntityProduct(source);
        }

        @Override
        public EntityProduct[] newArray(int size) {
            return new EntityProduct[size];
        }
    };
}
