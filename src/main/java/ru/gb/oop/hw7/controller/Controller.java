package ru.gb.oop.hw7.controller;

import ru.gb.oop.hw7.model.Complex;
import ru.gb.oop.hw7.service.DivideComplexData;
import ru.gb.oop.hw7.service.MultiplyComplexData;
import ru.gb.oop.hw7.service.SubtractComplexData;
import ru.gb.oop.hw7.service.SumComplexData;
import ru.gb.oop.hw7.view.ComplexView;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Controller {
    private DivideComplexData divideComplexData;
    private MultiplyComplexData multiplyComplexData;
    private SubtractComplexData subtractComplexData;
    private SumComplexData sumComplexData;
    private ComplexView complexView;

    public void start() {
        Scanner num = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);
        Logger logger = Logger.global.getLogger("Log");
        FileHandler fh;
        try {
            fh = new FileHandler(
                    "D:/GeekBrains/Объектно-ориентированное программирование/Семинары/Homework/hw7/ComplexCalculator/Log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.setUseParentHandlers(false);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        String repeat = "д";
        while (repeat.equals("д")) {
            Complex number1 = new Complex();
            Complex number2 = new Complex();

            try {
                System.out.println("Введите вещественную часть первого комплексного числа: ");
                number1.setRealNumber(num.nextInt());
                System.out.println("Введите мнимую часть первого комплексного числа: ");
                number1.setImaginary(num.nextInt());
                System.out.println("Введите вещественную часть второго комплексного числа: ");
                number2.setRealNumber(num.nextInt());
                System.out.println("Введите мннимую часть второго комплексного числа: ");
                number2.setImaginary(num.nextInt());
                logger.info("Комплексные числа заданы");
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число");
                logger.warning("Произошла ошибка ввода");
            }
            System.out.println("Какую операцию с комплексными числами выполнить?\n");
            System.out.println("1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление\n");
            int operation = 0;
            try {
                operation = num.nextInt();
                logger.info("Операция определена");
            } catch (InputMismatchException e) {
                System.out.println("Такой опции нет");
                logger.warning("Произошла ошибка ввода");
            }
            if (operation == 1) {
                complexView.printComplex(sumComplexData.SumComplex(number1, number2));
                logger.info("Результат вычислен успешно");
            } else if (operation == 2) {
                complexView.printComplex(subtractComplexData.SubtractComplex(number1, number2));
                logger.info("Результат вычислен успешно");
            } else if (operation == 3) {
                complexView.printComplex(multiplyComplexData.MultiplyComplex(number1, number2));
                logger.info("Результат вычислен успешно");
            } else if (operation == 4) {
                complexView.printComplex(divideComplexData.DivideComplex(number1, number2));
                logger.info("Результат вычислен успешно");
            } else {
                System.out.println("Такой опции нет");
                logger.warning("Произошла ошибка ввода");
            }
            System.out.println("Хотите вычислить новые значения? (д)а, нет");
            repeat = choice.next();
        }
    }
    public Controller() {
        divideComplexData = new DivideComplexData();
        multiplyComplexData = new MultiplyComplexData();
        subtractComplexData = new SubtractComplexData();
        sumComplexData = new SumComplexData();
        complexView = new ComplexView();
    }
}
