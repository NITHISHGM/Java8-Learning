package CompetitiveProgramming.NithishRoughWork;

import java.util.Scanner;

public class LoopsPractice {
   /* For a given N, return an arraylist containing the sum of even and
    odd integers of the first N natural numbers.*/
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int num = s.nextInt();
        int odd = 0;
        int even=0;

        for (int i=1;i< num+1;i++)
        {
            if(i%2==0)
            {
                even+=i;
            }else {
                odd+=i;
            }
        }
        System.out.println("result : "+odd+" "+even);
    }
}
