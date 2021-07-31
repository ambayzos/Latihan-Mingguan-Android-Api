package com.example.latihan.belajarretrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.latihan.belajarretrofit.R;
import com.example.latihan.belajarretrofit.entity.EntityProduct;

import java.util.ArrayList;
import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ViewHolderProduct> {

   private Context context;
   private List<EntityProduct> dataList;

    public AdapterProduct(ArrayList<EntityProduct> dataList, Context context){
        this.dataList = dataList;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolderProduct onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_product, parent, false);
        return new ViewHolderProduct(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  AdapterProduct.ViewHolderProduct holder, int position) {

        Glide.with(holder.itemView.getContext())
                .load(dataList.get(position).getImage_url())
                .apply(new RequestOptions())
                .into(holder.imgProduct);
        holder.txtNamaProduc.setText(dataList.get(position).getNamaProduct());
        holder.txtPrice.setText(dataList.get(position).getPrice());
        holder.txtDescription.setText(dataList.get(position).getDescription());
        holder.txtVariant.setText(dataList.get(position).getVariant());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ViewHolderProduct extends RecyclerView.ViewHolder {

        public TextView txtNamaProduc, txtPrice, txtDescription, txtVariant;
        public ImageView imgProduct;
        public ViewHolderProduct(@NonNull  View itemView) {
            super(itemView);
            txtNamaProduc = itemView.findViewById(R.id.txtNamaProduct);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtDescription=itemView.findViewById(R.id.txtDescription);
            txtVariant=itemView.findViewById(R.id.txtVariant);
            imgProduct = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
