package com.siroca.counter42.model;

public class CounterModel {
    public int toastNumber = 10;
    public int count = 0;

    public int getToastNumber() {
        return toastNumber;
    }

    public void setToastNumber(int toastNumber) {
        this.toastNumber = toastNumber;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getColorNumber() {
        return colorNumber;
    }

    public void setColorNumber(int colorNumber) {
        this.colorNumber = colorNumber;
    }

    public int colorNumber = 15;


    public void increment() {
        ++count;
    }

    public void decrement() {
        --count;
    }

    public int getCount() {
        return count;
    }
}
