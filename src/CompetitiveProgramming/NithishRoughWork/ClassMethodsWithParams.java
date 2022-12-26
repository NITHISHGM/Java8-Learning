package CompetitiveProgramming.NithishRoughWork;

public class ClassMethodsWithParams {

    public String myMethod(int a, int b, int c,int d,String name,String city)
    {
        int sum = a+b+c+d;
        int mul = a*b*c*d;
        String Concat = name+city;
        return "sum is "+sum+" "+"mul is "+mul+" "+"String is "+Concat;

    }
    public static void main(String[] args) {
        ClassMethodsWithParams m = new ClassMethodsWithParams();
        System.out.println(m.myMethod(1,2,3,4,"nithish","cdm"));

    }
}
