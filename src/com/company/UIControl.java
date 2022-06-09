package com.company;

public abstract class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public abstract void render();

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
