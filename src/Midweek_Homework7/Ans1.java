package Midweek_Homework7;

public class Ans1 {
    public static void main(String[] args) {
        int[] num ={3,5,7,56,34,9,10,32,66,77};
        int sum =0;
        for(int i = 0; i < num.length; i++){
            sum+=num[i];

        }
        float average = sum/ num.length;
        System.out.println(average);

    }

}
