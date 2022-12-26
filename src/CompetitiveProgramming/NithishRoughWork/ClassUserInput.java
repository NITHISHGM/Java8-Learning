package CompetitiveProgramming.NithishRoughWork;

import java.util.Scanner;

public class ClassUserInput {
    public String Mymethod(int a,String b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter number");
        int num;
        String Str;
        num = Scan.nextInt();
        System.out.println("enter String");
        Str = Scan.nextLine();
        ClassUserInput obj =  new ClassUserInput();
        String result =  obj.Mymethod(num,Str);
        System.out.println("result "+result);
    }
}
