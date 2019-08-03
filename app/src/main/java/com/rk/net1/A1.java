package com.rk.net1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class A1 extends AppCompatActivity {
    ImageView im;
    String url="https://images-na.ssl-images-amazon.com/images/I/61WIrnFJqjL._SL1200_.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        im=findViewById(R.id.im_id);
        Glide.with(A1.this)
                .load(url)
                .apply(new RequestOptions().placeholder(R.mipmap.ic_launcher))
                .into(im);
    }
}
