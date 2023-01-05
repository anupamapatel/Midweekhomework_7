package Midweek_Homework7;
import java.util.Scanner;
//Write a program to print the sum of two numbers entered by user by defining your
//own method.

public class Ans10 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter first number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        num2 = sc.nextInt();
        System.out.println("sum of two numbers is : " + (num1 + num2));
    }
}
