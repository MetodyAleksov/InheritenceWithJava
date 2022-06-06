package com.company;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox(String text) {
        super(true);
        this.text = text;
    }


    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
