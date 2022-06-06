package com.company;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void Enable(){
        isEnabled = true;
    }
    public void Disable(){
        isEnabled = false;
    }
    public boolean isEnabled(){
        return isEnabled;
    }
}
