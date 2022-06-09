package com.company;

public class CheckBox extends UIControl{
    public CheckBox() {
        super(true);
    }

    @Override
    public void render() {
        System.out.println("I am a rendered checkbox");
    }
}
