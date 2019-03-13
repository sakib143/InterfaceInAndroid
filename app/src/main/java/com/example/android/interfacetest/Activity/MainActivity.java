package com.example.android.interfacetest.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.android.interfacetest.Listner.BooleanListner;
import com.example.android.interfacetest.R;
import com.example.android.interfacetest.Listner.SetDataInterface;
import com.example.android.interfacetest.Utils.BooleanTest;
import com.example.android.interfacetest.Utils.Test;

public class MainActivity extends AppCompatActivity {

    private Button btnOptionOne, btnOptionTwo;
    private SetDataInterface setDataInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getIds();
        setListner();

        setDataInterface = (strMessege) -> {
            Log.e(" ==> ", " setData is calling in Main activity ");
        };

    }

    private void getIds() {
        try {
            btnOptionOne = findViewById(R.id.btnOptionOne);
            btnOptionTwo = findViewById(R.id.btnOptionTwo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setListner() {
        try {
            btnOptionOne.setOnClickListener(onClickListener);
            btnOptionTwo.setOnClickListener(onClickListener);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private View.OnClickListener onClickListener = (view) -> {
        switch (view.getId()) {
            case R.id.btnOptionOne:
                BooleanTest booleanTest = new BooleanTest(new BooleanListner() {
                    @Override
                    public void setBoolean(boolean isClicked) {
                        Log.e("=>", " is clicked in Activity");
                    }
                });
                booleanTest.invokeInterface();
                break;
            case R.id.btnOptionTwo:
                Test test = new Test(setDataInterface);
                test.setData();
                break;
        }

    };

}
