package CompetitiveProgramming.NithishRoughWork;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        int i;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number");

        i = myObj.nextInt();  // Read user input
        System.out.println("number is: " + i);
        if (i > 0) {
            System.out.println("num is postive");
        } else {
            System.out.println("num is negative");
        }

        String  res = (i<0)?"negative numbver":"positive number";
        System.out.println("shortend"+res);
    }
}
