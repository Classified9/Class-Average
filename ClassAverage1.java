package classAverage;

import java.util.Scanner;

public class ClassAverage1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      //  int total = 0;
        int count = 0;
        double grade = 0;
        double sum = 0;
        double average = 0;

        for(count= 0; count < 10; ++count){
            System.out.print("Enter grade: ");
            grade = scan.nextDouble();
            sum += grade ;
        }
        average = sum / count;
        System.out.printf("The class average is : %.2f",average);
    }
}
