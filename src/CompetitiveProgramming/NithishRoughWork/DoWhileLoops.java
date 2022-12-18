package CompetitiveProgramming.NithishRoughWork;

import java.util.Scanner;

public class DoWhileLoops {


    public static void main(String[] args) {
        int limit;
        int itr = 0;
        Scanner s=  new Scanner(System.in);
        limit =  s.nextInt();
        do
        {
            if(limit<0)
            {
                System.out.println("invalid limit");
            }
            System.out.println("itr"+itr);
            itr++;
        }
        while (itr <= limit );

    }



}
