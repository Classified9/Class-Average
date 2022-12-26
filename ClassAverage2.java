package classAverage;

import java.util.Scanner;

public class ClassAverage2 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int count = 0;
            double grade = 0;
            double sum = 0;
            double average = 0;
            int flagValue = -1;


        System.out.print("""
                        Enter grade: Or
                        Type -1 to exit
                        """);

        while (true){
            grade = scan.nextDouble();
            if (grade == flagValue){
                break;
            }
            sum += grade ;
            count++ ;
            System.out.print("""
                        Enter grade: Or
                        Type -1 to exit
                        """);
        }

            average = sum / count;
            System.out.printf("The class average is : %.2f",average);
        }

}
