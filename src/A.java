abstract public class A {

    static String d;
    public A(String d){

        System.out.println("inside A"+d);
    }

    public abstract void fun();


    public static void aFunction() {
        System.out.println(d);
    }

}

