package com.calculator;
import java.io.*;
import java.util.Random;

public class Calculator{
    int num1, num2, result ;
    int choice;

    public int add(int num1,int num2) throws IOException{
        result = num1+num2 ;
        return result;
    }

    public int subtract(int num1,int num2) throws IOException{
        result = num1-num2 ;
        return result;
    }

    public int multiply(int num1,int num2) throws IOException{
        result = num1*num2 ;
        return result;
    }
/*
    public int divide(int num1, int num2) throws IOException{
        if(num2!=0) {
            result = num1 / num2;
        }else{
            result = -1;
        }
        return result;
    }
*/

    public static void main(String[] args) throws  Exception{
        Calculator c = new Calculator();
        System.out.println("^^^^^^^^^^^^^^Calculator^^^^^^^^^^^^^^^^^");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5. EXIT");
        System.out.println("Enter your choice");

        Random r = new Random();
        int start = 1;
        int end = 5;
        int result = r.nextInt(end-start) + start;
        System.out.println("choice = " + result);
        c.choice = result;
        System.out.println(c.choice);
        switch(c.choice){
            case 1 :
                System.out.println("Add");
                c.num1 = 10;
                c.num2 = 20;
                int add_sol = c.add(c.num1,c.num2);
                System.out.println(" Add Result = " + add_sol);
                break;

            case 2 :
                System.out.println("Subtract");
                c.num1 = 20;
                c.num2 = 10;
                int sub_sol = c.subtract(c.num1,c.num2);
                System.out.println(" Subtract Result = " + sub_sol);
                break;

             case 3 :
                System.out.println("Multiply");
                c.num1 = 10;
                c.num2 = 10;
                int mul_sol = c.multiply(c.num1,c.num2);
                System.out.println("Multiplication Result = " + mul_sol);
                break;

            /*case 4 :

                System.out.println("Divide");
                c.num1 = 20;
                c.num2 = 10;
                int div_sol = c.divide(c.num1,c.num2);
                System.out.println("Division Result = " + div_sol);
                break;

            case 5 :
                System.exit(0);
                break;
*/
            default :
                System.out.println("INVALID CHOICE!!");
                break;

        }
        System.out.println("----------------------------------------");

    }


}