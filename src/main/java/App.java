/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */


/*
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.
Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        int a = getA();
        int b = getB();
        int c = getC();
        System.out.println(output(a, b, c));
    }

    private static int getA(){
        System.out.print("Enter the first number: ");
        String x = in.nextLine();
        if(x.matches("[0-9]+")){
            return Integer.parseInt(x.replace(" ", ""));
        }
        else{
            System.out.println("Enter a valid integer!");
            return getA();
        }
    }

    private static int getB(){
        System.out.print("Enter the second number: ");
        String x = in.nextLine();
        if(x.matches("[0-9]+")){
            return Integer.parseInt(x.replace(" ", ""));
        }
        else{
            System.out.println("Enter a valid integer!");
            return getB();
        }
    }

    private static int getC(){
        System.out.print("Enter the third number: ");
        String x = in.nextLine();
        if(x.matches("[0-9]+")){
            return Integer.parseInt(x.replace(" ", ""));
        }
        else{
            System.out.println("Enter a valid integer!");
            return getC();
        }
    }

    private static String output(int a, int b, int c){
        int d = largestNumber(a, b, c);
        return "The largest number is " + d + ".";
    }

    private static int largestNumber(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        else if(a == b && a == c){
            return a;
        }
        else{
            return c;
        }
    }
}
