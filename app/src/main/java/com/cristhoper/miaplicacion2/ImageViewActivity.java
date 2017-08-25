package com.cristhoper.miaplicacion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {

    private int[] photos = {
            R.drawable.img_agumon,
            R.drawable.img_greymon,
            R.drawable.img_metalgreymon,
            R.drawable.img_wargreymon,
            R.drawable.img_victorygreymon
    };
    private int index = 0;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imageView = (ImageView)findViewById(R.id.imageview);
    }

    public void nextImage(View view) {
        if(++index > photos.length-1)
            index = 0;
        imageView.setImageResource(photos[index]);
    }
    public void previousImage(View view) {
        if(--index < 0)
            index = photos.length-1;
        imageView.setImageResource(photos[index]);
    }

}

