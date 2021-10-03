package com.company;

public class Fraction {
    private int numerator;		//attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d){	// constructor
        numerator = n;
        denominator = d;
    }

    public Fraction(){
        numerator = 3;
        denominator = 4;
    }

    //TODO default constructor (no arguments)

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other) {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    // TODO  subtract()
    public Fraction subtract(Fraction other){
        int n = this.numerator*other.denominator - this.denominator*other.numerator;
        int d = this.denominator*other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }


    // TODO multiply()
    public Fraction multiply(Fraction other){
        int n = this.numerator*other.numerator;
        int d = this.denominator*other.denominator;

        Fraction result = new Fraction(n,d);
        return result;
    }

    // TODO toString()
    public String toString(){
        String s = numerator + "/" + denominator;
        return s;
    }

    // TODO reciprocal()
    public Fraction reciprocal(){
        int n = this.denominator;
        int d = this.numerator;

        Fraction result = new Fraction(n,d);
    return result;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);	// create an instance of fraction
        Fraction f2 = new Fraction(4,5);
        Fraction f3 = f1.add(f2);			// add 2 fractions
        System.out.println(f1 + " plus " + f2 + " = " + f3);	// print the answer
        Fraction f4 = f1.subtract(f2);
        System.out.println(f1 + " minus " + f2 + " = " + f4);
        Fraction f5 = f1.multiply(f2);
        System.out.println(f1 + " times " + f2 + " is " + f5);
        Fraction f6 = f1.reciprocal();
        System.out.println("The reciprocal of " + f1 + " is " + f6);

        Fraction f7 = new Fraction();
        Fraction f8 = new Fraction();

        Fraction f9 = f7.add(f8);
        System.out.println(f7 + " plus " + f8 + " is " + f9);

		/*
		com.company.Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

		Add code to multiply f1 and f2 here

		Add code to call reciprocal here

		create 2 new fractions and add them here.

		*/


    }

}