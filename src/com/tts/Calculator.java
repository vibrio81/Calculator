package com.tts;



    public class Calculator {

        //add method
        public int add(int num1, int num2)
        {
            return num1 + num2;
        }
        //subtract method
        public int subtract (int num1, int num2)
        {
            return num1 - num2;
        }
        //multiply method
        public int multiply (int num1, int num2)
        {
            return num1 * num2;
        }
        //divide method
        public int divide (int num1, int num2)
        {
            if (num2 == 0)
            {
                System.out.println ("num2 cannot be zero");
                return 0;
            }
            else
                return num1 / num2;
        }

        //square method
        public int square (int num1)
        {
            return num1 * num1;
        }}


    class MagicCalculator extends Calculator{



        /*public double squareRoot(int num) {
            return Math.sqrt(num);
        }

        public double sin(int num) {
            return Math.sin(Math.toRadians(num));
        }

        public double cosine(int num) {
            return Math.cos(Math.toRadians(num));
        }

        public double tangent(int num) {
            return Math.tan(Math.toRadians(num));
        }

*/      public double pow(double a, double b){
            return Math.pow(a,b);
        }

        public double log(int num){
            return Math.log(num);
        }
        public int factorial(int n){

            return (n == 1 || n == 0) ? 1 : n * factorial (n - 1);
        }



    }


