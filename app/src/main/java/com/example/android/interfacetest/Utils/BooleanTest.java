package com.example.android.interfacetest.Utils;

import com.example.android.interfacetest.Listner.BooleanListner;

public class BooleanTest {

    private BooleanListner booleanListner;


    public BooleanTest(BooleanListner booleanListner){
        this.booleanListner = booleanListner;
    }

    public void invokeInterface(){
        booleanListner.setBoolean(true);
    }


}
