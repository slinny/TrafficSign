package com.example.android.trafficsign.recyclerview;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.android.trafficsign.R;
import com.example.android.trafficsign.model.SignModel;

public class SignViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public SignViewHolder(View view) {
        super(view);
        textView = view.findViewById(R.id.sign_name_textview);
    }

    public void onBind(final SignModel signModel) {
        if(signModel.getName().equals("DISPLAYING_MESSAGE")){
            textView.setText(signModel.getName());
            textView.setTextColor(Color.BLACK);
        }else{
            textView.setText(signModel.getName());
            textView.setTextColor(Color.GRAY);
        }
    }
}
