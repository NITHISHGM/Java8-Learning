package CompetitiveProgramming.NithishRoughWork;

public class InfinityWhileLoops {
    public static void main(String[] args) {
        int numExc = 0;
        while (true)
        {
            numExc++;

            if(numExc == 3278557)
            {
                continue;
            }else if(numExc == 3278559)
            {
                break;
            }
            System.out.println("in"+numExc);

        }

    }
}
