package ru.gb.oop.hw7.service;

import ru.gb.oop.hw7.model.Complex;

public class DivideComplexData implements DivideComplexService {
    @Override
    public Complex DivideComplex(Complex number1, Complex number2) {
        Complex number3 = new Complex();
        number3.setRealNumber((number1.getRealNumber() * number2.getRealNumber() + number1.getImaginary() * number2.getImaginary()) /
                (number2.getRealNumber()) * number2.getRealNumber() + number2.getImaginary() * number2.getRealNumber());
        number3.setImaginary((number1.getImaginary() * number2.getRealNumber() - number1.getRealNumber() * number2.getImaginary()) /
                (number2.getRealNumber()) * number2.getRealNumber() + number2.getImaginary() * number2.getImaginary());
        return number3;
    }
}
