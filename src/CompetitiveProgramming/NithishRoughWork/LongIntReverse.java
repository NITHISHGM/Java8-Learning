package CompetitiveProgramming.NithishRoughWork;

public class LongIntReverse {
    public static void main(String[] args) {
        int num = 123456;
        int temp=num;
        int remainder = 0;
        int rev=0;
        while (temp>0)
        {
         remainder = temp%10;
         rev = rev*10+remainder;
         temp = temp/10;
        }
        System.out.println(rev);
    }
}
