public class StaticBlock {

    //  Static block is always executed, when the class is loaded on to the stack memory.
    //  Regardless of the number of instances created from same object, static block is executed only once.

    static int a = 10;
    static int b;


    static{
        System.out.println("Hello World");
        b = a*10;
    }


    public static void main(String[] args) {
        StaticBlock obj;
        System.out.println(b);

        //  Creating new object
        //  'Hello World' won't be printed as static block is not called now
        StaticBlock sb = new StaticBlock();
    }
}
