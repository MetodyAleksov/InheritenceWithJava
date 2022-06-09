package com.company;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox(String text) {
        super(true);
        this.text = text;
    }

    @Override
    public String toString(){
        return this.text;
    }

    @Override
    public void render(){
        System.out.println(text);
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
