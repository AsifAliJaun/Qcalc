package com.crio.qcalc;

import javax.xml.transform.Result;

public class ScientificCalculator extends StandardCalculator {
    protected double result;

    public static void getVersion() {
        System.out.println("Scientific Calculator 1.0");
    }
    public double getResult() {
        return result;
    }


    public void setResult(int value) {
        this.result = value;

    }

    public void sin(double a) {
        result = Math.sin(a);
    }

    public void cos(double a) {
        result = Math.cos(a);
    }

    public void square(double a) {
        result=Math.pow(a, 2);

    }

    public void tan(double a) {
        result = Math.tan(a);
    }


    public void log(double a) {
        result = Math.log(a);
    }

    public void cbrt(double a) {
        result = Math.cbrt(a);
    }
    public void sqrt(double a) {
        result = Math.sqrt(a);
    }
    
@Override
public void printResult(){

    System.out.println("Scientific Calculator Result:"+ result );

}
public static void main(String[] args) {
    ScientificCalculator sc=new ScientificCalculator();
    sc.printResult();
}






}
