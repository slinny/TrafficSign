package com.example.android.trafficsign.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.trafficsign.R;
import com.example.android.trafficsign.model.SignModel;

import java.util.List;

public class SignAdapter extends RecyclerView.Adapter<SignViewHolder> {

    List<SignModel> signModelList;

    public SignAdapter(List<SignModel> signModelList) {
        this.signModelList = signModelList;
    }

    @NonNull
    @Override
    public SignViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sign,parent,false);
        return new SignViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SignViewHolder holder, int position) {
        holder.onBind(this.signModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return this.signModelList.size();
    }
}
