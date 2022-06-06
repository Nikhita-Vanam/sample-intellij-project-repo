package com.sapient.asde.ui;

import com.sapient.asde.service.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("11.23+23.45 = "+calculator.add(11.23,23.45));
    }
}
