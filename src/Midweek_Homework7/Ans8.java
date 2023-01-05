package Midweek_Homework7;
import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.util.Scanner;
//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.

public class Ans8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println( " Enter total lecture held:");
        double a = s.nextDouble();
        System.out.println(" Enter attendance:");
        Double b = s.nextDouble();
        double c = (b/a * 100);
        if (c<75.0){
            System.out.println("your attendance is low you cant give exam");

        }
        else {
            System.out.println("you can give exam");
        }

    }

}
