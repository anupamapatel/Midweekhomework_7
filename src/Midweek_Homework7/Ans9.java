package Midweek_Homework7;

import java.util.Scanner;

//Modify the above question to allow student to sit if he/she has medical cause. Ask
//user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
public class Ans9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println( " Enter total lecture held:");
        double a = s.nextDouble();
        System.out.println(" Enter attendance:");
        Double b = s.nextDouble();
        double c = (b/a * 100);
        if (c<75.0){
            System.out.println("your attendance is low you cant give exam");
            char d = s.next().charAt(0);
            if(d=='Y'){
                System.out.println("you can give exam:");
            }
            else {
                System.out.println("you cannot give exam");
            }

        }
        else {
            System.out.println("you can give exam");
        }

    }

}


