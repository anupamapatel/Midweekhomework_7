package Midweek_Homework7;
//Take input of age of 3 people by user and determine oldest and youngest among
//them.

public class Ans7 {

    public static void main(String[] args) {
        int a = 50, b = 10, c = 6;
        if (a<b) {
            if (a<c)
                System.out.println(a);
            else
                System.out.println(c);
         }
         else
         {
             if(b<c)
                 System.out.println(b);
             else
                 System.out.println(c);


        }
    }

}
