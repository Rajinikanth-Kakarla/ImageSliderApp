package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // using setImageResource
    // public void onClickButton(View view){
        // ImageView img = findViewById(R.id.imageView1);
        // img.setImageResource(R.drawable.g2);
    // }
    // using get
    public void onClickButton(View view){
        ImageView img = findViewById(R.id.imageView1);
        if (img.getTag() != null){
            if((Integer) img.getTag() == R.drawable.g1){
                img.setImageResource(R.drawable.g2);
                img.setTag(R.drawable.g2);
            }
            else{
                img.setImageResource(R.drawable.g1);
                img.setTag(R.drawable.g1);
            }
        }else{
            img.setImageResource(R.drawable.g1);
            img.setTag(R.drawable.g1);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}