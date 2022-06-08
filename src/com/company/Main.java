package com.company;

public class Main {

    public static void main(String[] args) {
	    var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }

    public static void show(UIControl control){
        if(control instanceof TextBox){
            System.out.println("I am a text box not a UIControl!");
        }
        System.out.println(control);
    }
}
