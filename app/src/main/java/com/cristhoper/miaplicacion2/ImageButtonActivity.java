package com.cristhoper.miaplicacion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ImageButtonActivity extends AppCompatActivity {

    private ImageButton imgBtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        imgBtn1  = (ImageButton) findViewById(R.id.imageButton1);
    }

    public void firstImageButton(View v){
        imgBtn1.setImageResource(R.drawable.bg_faceowl);
    }

}
