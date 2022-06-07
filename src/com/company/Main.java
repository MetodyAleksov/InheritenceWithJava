package com.company;

public class Main {

    public static void main(String[] args) {
	    var control = new UIControl(true);

        show(control);
    }

    public static void show(UIControl control){
        if(control instanceof TextBox){
            System.out.println("I am a text box not a UIControl!");
        }
        System.out.println(control);
    }
}
