package Midweek_Homework7;
import java.util.Scanner;
//Take values of length and breadth of a rectangle from user and check if it is square or not.

public class Ans4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println(" enter length:");
        int a = sr.nextInt();
        System.out.println(" enter breadth:");
        int b = sr.nextInt();

        if (a==b){
            System.out.println(" its a square:");
        }
        else {
            System.out.println("its a rectangle");
        }

    }
}