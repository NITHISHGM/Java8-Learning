package CompetitiveProgramming.NithishRoughWork;

public class ClassMethod {

    static void func2()
    {
        System.out.println("static void func2 called");
    }
    static String func3()
    {
        return "Static String func3 called";
    }
    public void func1()
    {
        System.out.println("void func-1 called");
    }
    public String func()
    {
        return "String func called";
    }
    public static void main(String[] args) {
//        Static method call
        ClassMethod.func2();
        System.out.println(ClassMethod.func3());

//        object method call

        ClassMethod  clsMtd = new ClassMethod();
        clsMtd.func1();
        System.out.println(clsMtd.func());

    }
}
