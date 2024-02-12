public class Main {
    public static void main(String[] args) {

        Son son = new Son();
        son.career();
        son.partner();

        Parent p = new Parent() {
            @Override
            void career() {
                System.out.println("I am a parent");
            }

            @Override
            void partner() {
                System.out.println("I have a partner.");
            }

            int age(){
                return 25;
            }
        };

        System.out.println(p.age());
        p.career();
        p.partner();

    }
}