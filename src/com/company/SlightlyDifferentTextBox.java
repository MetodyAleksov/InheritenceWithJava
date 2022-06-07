package com.company;

public class SlightlyDifferentTextBox extends TextBox {
    public SlightlyDifferentTextBox(String text) {
        super(text);
    }

    @Override
    public void setText(String Text){
        this.setText( "Told you i was unique");
    }
}
