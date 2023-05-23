package com.crio.qcalc;

import javax.naming.spi.DirStateFactory.Result;
import javax.rmi.ssl.SslRMIClientSocketFactory;

public class StandardCalculator {
    private double result;

    public double getResult() {
        return result;
    }


    public void setResult(int value) {
        this.result = value;

    }

    public void clearResult() {
        result = 0;
    }

    public final void add(int num1, int num2) {
        add((double) num1, (double) num2);
        result = num1 + num2;
    }



    public final void subtract(int num1, int num2) {
        subtract((double) num1, (double) num2);
        result = num1 - num2;
    }


    public final void multiply(int num1, int num2) {
        multiply((double) num1, (double) num2);
        result = num1 * num2;
    }


    public final void divide(int num1, int num2) {
        divide((double) num1, (double) num2);
        result = num1 / num2;
    }


    // Method Overloading

    public void add(double num1, double num2) {

        double result = num1 + num2;

        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;

    }



    public void subtract(double num1, double num2) {

        double result = num1 - num2;

        if ((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)) {

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;

    }



    public  void multiply(double num1, double num2) {
        double result = num1*num2;
        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)
                || (result == Double.NEGATIVE_INFINITY)) {

            throw new ArithmeticException("Double overflow");

        }

        this.result=num1*num2;
    }



    public final void divide(double num1, double num2) {

        if (num2 == 0.0) {

            throw new ArithmeticException("Divide By Zero");

        }

       this.result = num1 / num2;

    }



    public void printResult() {
        System.out.println("Standard Calculator Result:" + result);

    }


    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }

    public static void main(String[] args) {

        StandardCalculator calc = new StandardCalculator();

        calc.add(Double.MAX_VALUE, 1.0);

        calc.printResult();

    }
}
