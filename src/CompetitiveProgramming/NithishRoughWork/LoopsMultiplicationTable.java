package CompetitiveProgramming.NithishRoughWork;

import java.util.Scanner;

public class LoopsMultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num  = s.nextInt();
        int itr = 1;
        int limit =10;

        if(num>0)
        {
            for (int i=1;i<=10;i++)
            {
                System.out.println(num+"*"+i+"="+num*i);
            }
        }else{
            System.out.println("Negative Integer");
        }
//        do{
//            if(num>0)
//            {
//
//                System.out.println(num+"*"+itr+"="+itr*num);
//                itr++;
//
//            }else{
//                System.out.println("negative integer");
//            }
//
//        }while (itr<=limit);
    }
}
