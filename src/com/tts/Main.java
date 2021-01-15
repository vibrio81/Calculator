package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Calculator calculator = new Calculator ();
            MagicCalculator myMagic = new MagicCalculator();
            Scanner sc = new Scanner (System.in);

            System.out.print("Enter Number: ");

            int num = sc.nextInt ();
            int sq = calculator.square (num);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int add = calculator.add(num1, num2);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("The sum of the numbers: "+ num1+ "+" + num2 +"=" + add);
            System.out.println("The differance of the numbers: "+ num1+ "-" + num2 +"=" + calculator.subtract(num1,num2));
            System.out.println("The product of the numbers: "+ num1+ "X" + num2 +"=" + calculator.multiply(num1,num2));
            System.out.println("The dividend of the numbers: "+ num1+ "/" + num2 +"=" + calculator.divide(num1,num2));
            System.out.println ("The Square Root of " + num + " is: " + sq);
            System.out.println ("Enter angle in degrees :");

            double degree = sc.nextDouble ();
            double radians = Math.toRadians (degree);

            System.out.println ("Sin is: " + Math.sin (radians));
            System.out.println ("Cosine is: " + Math.cos (radians));
            System.out.println ("Tangent is: " + Math.tan (radians));
            System.out.println ("The Factorial of " + num + " is " + myMagic.factorial(num));

            System.out.println("Log is "+Math.log(radians));
           System.out.println ("Enter a number and its exponent :");


            System.out.println("The exponent of " + a + " raised to the " + b + " power is: " + Math.pow(a,b));
    }


}

