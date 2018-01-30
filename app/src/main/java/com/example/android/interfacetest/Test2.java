package com.example.android.interfacetest;

import android.util.Log;

/**
 * Created by Android on 26-Dec-17.
 */

public class Test2 implements SetDataInterface {
    @Override
    public void setData() {
        Log.e("Test2 is calling "," ==>");
    }
}
