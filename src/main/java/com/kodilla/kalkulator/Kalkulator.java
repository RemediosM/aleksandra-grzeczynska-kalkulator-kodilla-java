package com.kodilla.kalkulator;

public class Kalkulator {
    private double a;
    private double b;

    public Kalkulator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void dodaj() {
        final double v = a + b;
        System.out.println(a + " + " + b + " = " + v);
    }

    public void odejmij() {
        final double v = a - b;
        System.out.println(a + " - " + b + " = " + v);
    }


    public static void main(String args[]) {
        Kalkulator kalkulator = new Kalkulator(2.7, 5);
        kalkulator.dodaj();
        kalkulator.odejmij();
    }
}

