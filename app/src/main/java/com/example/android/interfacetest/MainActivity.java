package com.example.android.interfacetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements SetDataInterface {

    private Button btnSetData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSetData = (Button)findViewById(R.id.btnSetData);

        SetDataInterface setData = new MainActivity();
        setData.setData();



        btnSetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SetDataInterface setData = (SetDataInterface) MainActivity.this;
                setData.setData();

                setData = new Test();
                setData.setData();

                setData = new Test2();
                setData.setData();
            }
        });

    }

    @Override
    public void setData() {

        Log.e("setData() is calling "," ==>");

    }
}
