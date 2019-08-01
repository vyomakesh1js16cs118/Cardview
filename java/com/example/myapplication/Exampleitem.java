package com.example.myapplication;

public class Exampleitem {
    private int mImageResource;
    private String mText;
    public Exampleitem(int imageres,String text) {
        mImageResource = imageres;
        mText = text;
    }
    public int getmImageResource(){
        return mImageResource;
    }
    public String getmText(){
        return mText;
    }
}
