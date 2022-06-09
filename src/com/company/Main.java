package com.company;

public class Main {

    public static void main(String[] args) {
	    UIControl[] controls =
                {new TextBox("something"), new CheckBox()};

        for (var control : controls) {
            control.render();
        }
    }

    public static void show(UIControl control){
        if(control instanceof TextBox){
            System.out.println("I am a text box not a UIControl!");
        }
        System.out.println(control);
    }
}
