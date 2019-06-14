package com.test.test;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder add_place_marker_dialog;

    private Button button;


    private TextView lat;
    private TextView lon;
    private TextView title;
    private TextView date;
    private TextView depth;
    private TextView amount;
    private TextView note;
    private TextView title_alert;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        context = MainActivity.this;


        button = (Button) findViewById(R.id.detail);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Google();

            }
        });
    }


    @SuppressLint("ResourceAsColor")
    public void Google() {

        LayoutInflater li = LayoutInflater.from(context);
        View promptsView = li.inflate(R.layout.deatail, null);
        add_place_marker_dialog = new AlertDialog.Builder(context);

        add_place_marker_dialog.setView(promptsView);


        title_alert = (TextView) promptsView.findViewById(R.id.title_alert);
        lat = (TextView) promptsView.findViewById(R.id.latitude_alert);
        lon = (TextView) promptsView.findViewById(R.id.longitude_alert);
        title = (TextView) promptsView.findViewById(R.id.title);
        date = (TextView) promptsView.findViewById(R.id.date);
        depth = (TextView) promptsView.findViewById(R.id.depth);
        amount = (TextView) promptsView.findViewById(R.id.amount);
        note = (TextView) promptsView.findViewById(R.id.note);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "15352.ttf");

        title_alert.setTypeface(tf);

      /*  lat.setTypeface(tf);
        lon.setTypeface(tf);
        title.setTypeface(tf);
        date.setTypeface(tf);
        depth.setTypeface(tf);
        amount.setTypeface(tf);
        note.setTypeface(tf);*/




        add_place_marker_dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {




            }
        });

        AlertDialog alert11 = add_place_marker_dialog.create();

        alert11.getWindow().setBackgroundDrawableResource(R.color.color);
        alert11.show();


        Button buttonbackground = alert11.getButton(DialogInterface.BUTTON_POSITIVE);

       // buttonbackground.setBackgroundColor(Color.BLUE);
        buttonbackground.setTextColor(Color.parseColor("#FFFFFF"));
    }


}




