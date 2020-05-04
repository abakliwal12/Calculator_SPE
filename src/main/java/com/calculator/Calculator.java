package com.calculator;

        import java.io.*;
        import java.util.Scanner;

public class Calculator{
    int num1, num2, result ;
    char ch ;
    int choice;

    public int add(int num1,int num2) throws IOException{
        result = num1+num2 ;
        return result;
    }

    /*public int subtract(int num1,int num2) throws IOException{
        result = num1-num2 ;
        return result;
    }

    public int multiply(int num1,int num2) throws IOException{
        result = num1*num2 ;
        return result;
    }

    public int divide(int num1, int num2) throws IOException{
        if(num2!=0) {
            result = num1 / num2;
        }else{
            result = -1;
        }
        return result;
    }
*/
    /*
    public float modulus(float num1,float num2) throws IOException{
        result = num1%num2 ;
        return result;
    }
*/
    public static void main(String args[]) throws  Exception{
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------Calculator---------------------------------");
        System.out.println("1. ADDITION");
        /*System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5. MODULUS");
        System.out.println("6. EXIT");
        System.out.println("Enter your choice");
        */
        int a,b,f;
        f=sc.nextInt();
        System.out.println("choice = " + f);
        c.choice = f;
        System.out.println(c.choice);
        switch(c.choice){
            case 1 :
                System.out.println("Add");
                System.out.println("Enter two numbers :");
                a=sc.nextInt();
                b=sc.nextInt();
                c.num1 = a;
                c.num2 = b;
                int add_sol = c.add(c.num1,c.num2);
                System.out.println(" Addition Result = " + add_sol);
                break;

            /*case 2 :
                System.out.println("Subtract");
                System.out.println("Enter two numbers :");
                a=sc.nextInt();
                b=sc.nextInt();
                c.num1 = a;
                c.num2 = b;
                int sub_sol = c.subtract(c.num1,c.num2);
                System.out.println(" Subtraction Result = " + sub_sol);
                break;

            case 3 :
                System.out.println("Multiply");
                System.out.println("Enter two numbers :");
                a=sc.nextInt();
                b=sc.nextInt();
                c.num1 = a;
                c.num2 = b;
                int mul_sol = c.multiply(c.num1,c.num2);
                System.out.println("Multiplication Result = " + mul_sol);
                break;

            case 4 :

                System.out.println("Divide");
                System.out.println("Enter two numbers :");
                a=sc.nextInt();
                b=sc.nextInt();
                c.num1 = a;
                c.num2 = b;
                int div_sol = c.divide(c.num1,c.num2);
                System.out.println("Division Result = " + div_sol);
                break;


            case 5 :
                System.out.println("Modulus");
                System.out.println("Enter two numbers :");
                a=sc.nextInt();
                b=sc.nextInt();
                c.num1 = a;
                c.num2 = b;
                int mod_sol = c.modulus(c.num1,c.num2);
                System.out.println("Modulus Result = " + mod_sol);
                break;


            case 6 :
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