package com.cristhoper.miaplicacion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        Button btn2 = (Button) findViewById(R.id.scrollViewHorizontal);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(ScrollViewActivity.this, ScrollViewHorizontalActivity.class);
                startActivity(act2);
            }
        });

        Button btn3 = (Button) findViewById(R.id.androidButton);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act3 = new Intent(ScrollViewActivity.this, AndroidButtonActivity.class);
                startActivity(act3);
            }
        });

        Button btn4 = (Button) findViewById(R.id.imageButtonActivity);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act4 = new Intent(ScrollViewActivity.this, ImageButtonActivity.class);
                startActivity(act4);
            }
        });

        Button btn5 = (Button) findViewById(R.id.editTextActivity);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act5 = new Intent(ScrollViewActivity.this, EditTextActivity.class);
                startActivity(act5);
            }
        });

        Button btn6 = (Button) findViewById(R.id.checkBoxActivity);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act6 = new Intent(ScrollViewActivity.this, CheckBoxActivity.class);
                startActivity(act6);
            }
        });

        Button btn7 = (Button) findViewById(R.id.radioButtonActivity);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act7 = new Intent(ScrollViewActivity.this, RadioButtonActivity.class);
                startActivity(act7);
            }
        });

        Button btn8 = (Button) findViewById(R.id.switchButtonActivity);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act8 = new Intent(ScrollViewActivity.this, SwitchButtonActivity.class);
                startActivity(act8);
            }
        });

        Button btn9 = (Button) findViewById(R.id.toggleButtonActivity);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act9 = new Intent(ScrollViewActivity.this, ToggleButtonActivity.class);
                startActivity(act9);
            }
        });

        Button btn10 = (Button) findViewById(R.id.ratingBarActivity);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act10 = new Intent(ScrollViewActivity.this, RatingBarActivity.class);
                startActivity(act10);
            }
        });

        Button btn11 = (Button) findViewById(R.id.spinnerActivity);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act11 = new Intent(ScrollViewActivity.this, SpinnerActivity.class);
                startActivity(act11);
            }
        });

        Button btn12 = (Button) findViewById(R.id.progressBarActivity);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act12 = new Intent(ScrollViewActivity.this, ProgressBarActivity.class);
                startActivity(act12);
            }
        });

        Button btn13 = (Button) findViewById(R.id.datePickerActivity);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act13 = new Intent(ScrollViewActivity.this, DatePickerActivity.class);
                startActivity(act13);
            }
        });

        Button btn14 = (Button) findViewById(R.id.timePickerActivity);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act14 = new Intent(ScrollViewActivity.this, TimePickerActivity.class);
                startActivity(act14);
            }
        });

        Button btn15 = (Button) findViewById(R.id.floatingActionButtonActivity);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act15 = new Intent(ScrollViewActivity.this, FloatingActionButtonActivity.class);
                startActivity(act15);
            }
        });

        Button btn16 = (Button) findViewById(R.id.seekBarActivity);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act16 = new Intent(ScrollViewActivity.this, SeekBarActivity.class);
                startActivity(act16);
            }
        });

        Button btn17 = (Button) findViewById(R.id.simpleDialogActivity);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act17 = new Intent(ScrollViewActivity.this, SimpleDialogActivity.class);
                startActivity(act17);
            }
        });

        Button btn18 = (Button) findViewById(R.id.customAlertDialogActivity);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act18 = new Intent(ScrollViewActivity.this, CustomAlertDialogActivity.class);
                startActivity(act18);
            }
        });

        Button btn19 = (Button) findViewById(R.id.snackBarActivity);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act19 = new Intent(ScrollViewActivity.this, SnackBarActivity.class);
                startActivity(act19);
            }
        });

        Button btn20 = (Button) findViewById(R.id.notificationActivity);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act20 = new Intent(ScrollViewActivity.this, NotificationActivity.class);
                startActivity(act20);
            }
        });

        Button btn21 = (Button) findViewById(R.id.videoViewActivity);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act21 = new Intent(ScrollViewActivity.this, VideoViewActivity.class);
                startActivity(act21);
            }
        });

        Button btn22 = (Button) findViewById(R.id.webViewActivity);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act22 = new Intent(ScrollViewActivity.this, WebViewActivity.class);
                startActivity(act22);
            }
        });

        Button btn23 = (Button) findViewById(R.id.searchViewActivity);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act23 = new Intent(ScrollViewActivity.this, SearchViewActivity.class);
                startActivity(act23);
            }
        });

        Button btn24 = (Button) findViewById(R.id.calendarViewActivity);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act24 = new Intent(ScrollViewActivity.this, CalendarViewActivity.class);
                startActivity(act24);
            }
        });
    }
}
