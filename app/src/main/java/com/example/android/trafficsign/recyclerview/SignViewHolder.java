package com.example.android.trafficsign.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.android.trafficsign.InfoActivity;
import com.example.android.trafficsign.R;
import com.example.android.trafficsign.model.SignModel;

public class SignViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView textView;
    private Context context;

    public SignViewHolder(View view) {
        super(view);
        textView = view.findViewById(R.id.sign_name_textview);
        context = view.getContext();
        view.setOnClickListener(this);
    }

    public void onBind(final SignModel signModel) {
        if(signModel.getStatus().equals("DISPLAYING_MESSAGE")){
            textView.setText(signModel.getName());
            textView.setTextColor(Color.BLACK);
        }else{
            textView.setText(signModel.getName());
            textView.setTextColor(Color.GRAY);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, InfoActivity.class);
        intent.putExtra("message", "Test Message");
        context.startActivity(intent);
    }
}
