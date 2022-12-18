package CompetitiveProgramming.NithishRoughWork;

import java.util.Scanner;

public class LoopsFactorial {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int num = s.nextInt();
        int res=1;
        for(int i=num; i>0; i--)
        {
          res*=i;
        }
        System.out.println("res"+res);

    }
}
