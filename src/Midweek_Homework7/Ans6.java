package Midweek_Homework7;



public class Ans6 {
///*     if(condition){
//                  if body;
//           }else if (condition){
//                 else if body;
//           }else{
//                 else body;
//          }
    public static void main(String[] args) {
        int marks = 56;

        if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks<=80  && marks >= 60){
            System.out.println("Grade B");
        } else if (marks<=60  && marks >= 50){
            System.out.println("Grade C");
        } else if (marks<=50  && marks >= 45){
            System.out.println("Grade D");
        } else if (marks<=45  && marks >= 25){
            System.out.println("Grade E");
        } else if (marks <=25) {
            System.out.println("Grade F");
        } else {
            System.out.println("Fail");
        }
        System.out.println("Hello Java");

        }

    }

