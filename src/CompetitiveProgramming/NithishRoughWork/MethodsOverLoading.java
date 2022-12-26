package CompetitiveProgramming.NithishRoughWork;

public class MethodsOverLoading {
// method overloading, multiple methods can have the same name with different parameters:
    static int myMethod(int a, int b)
    {
        return a+b;
    }
    static float myMethod(float a, float b)
    {
        return  a+b;
    }
    public static void main(String[] args) {
        int ans = myMethod(12,12);
        float ansF= myMethod(12.22f,22.22f);
        System.out.println("int method "+ans+" float method "+ansF);

    }
}
