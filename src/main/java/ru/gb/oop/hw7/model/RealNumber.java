package ru.gb.oop.hw7.model;

public abstract class RealNumber {
    protected int realNumber;

    public RealNumber(int realNumber) {
        this.realNumber = realNumber;
    }

    public RealNumber() {
    }

    public int getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(int realNumber) {
        this.realNumber = realNumber;
    }
}
