class Solution extends A{
    String str = "solution";

    public Solution () {
        super("lkdf");
        System.out.println("inside Solution");
    }


    public void display() {
        System.out.println(str);
        aFunction();
    }

    @Override
    public void fun() {
        
    }
}