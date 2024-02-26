package ru.gb.oop.hw7.view;

import ru.gb.oop.hw7.model.Complex;

public class ComplexView {
    public void printComplex(Complex number){
        System.out.println("Комплексное число: "
                            + number.getRealNumber() + " + "
                            + number.getImaginary() + "i");
    }
}
