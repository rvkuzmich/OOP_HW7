package ru.gb.oop.hw7.service;

import ru.gb.oop.hw7.model.Complex;

public class SumComplexData implements SumComplexService {
    @Override
    public Complex SumComplex(Complex number1, Complex number2) {
        Complex number3 = new Complex();
        number3.setRealNumber(number1.getRealNumber() + number2.getRealNumber());
        number3.setImaginary(number1.getImaginary() + number2.getImaginary());
        return number3;
    }
}
