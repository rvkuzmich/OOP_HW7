package ru.gb.oop.hw7.model;

public class Complex extends RealNumber {
    private int imaginary;

    public Complex(int realNumber, int imaginary) {
        super(realNumber);
        this.imaginary = imaginary;
    }

    public Complex() {
        super();
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
}
