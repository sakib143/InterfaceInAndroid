package com.example.android.interfacetest;

import android.util.Log;

/**
 * Created by Android on 26-Dec-17.
 */

public class Test implements SetDataInterface {
    @Override
    public void setData() {
        Log.e("Test is calling "," ==>");
    }
}
