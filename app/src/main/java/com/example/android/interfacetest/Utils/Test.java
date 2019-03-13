package com.example.android.interfacetest.Utils;

import android.util.Log;

import com.example.android.interfacetest.Listner.SetDataInterface;

/**
 * Created by Android on 26-Dec-17.
 */

public class Test {

    private SetDataInterface setDataInterface;

    public Test(SetDataInterface setDataInterface){
        this.setDataInterface = setDataInterface;
    }

    public void setData() {
        setDataInterface.setData("Test class is calling !!1 ");

    }
}
