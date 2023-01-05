package Midweek_Homework7;
import java.util.Scanner;

public class Ans_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" First person:   ");
        int age1 = scan.nextInt();
        System.out.println(" Second person:   ");
        int age2 = scan.nextInt();
        System.out.println(" Third person:   ");
        int age3 = scan.nextInt();

        if (age1 < age2 && age1 < age3) {
            System.out.println(" First person is the Youngest");
        } else if (age2 < age1 && age2 < age3) {
            System.out.println("Second person is the youngest");
        } else if (age3 < age1 && age3 < age2) {
            System.out.println("Third person is the youngest");

            if (age1 > age2 && age1 > age3) {
                System.out.println(" First person is the oldest");
            } else if (age2 > age1 && age2 > age3) {
                System.out.println("Second person is the Oldest");
            } else if (age3 > age1 && age3 > age2) {
                System.out.println("Third person is the oldest");

            }
        }
    }
}

