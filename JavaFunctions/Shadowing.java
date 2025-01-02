public class Shadowing {
    static int x = 23 ; //this will be shadowed at line 6
    public static void main(String[] args){

        // Shadoing
        int x ; //the class variable at line 2 is shadowed by this\
        // System.out.println(x); //the scope will begin when value is initialised
        x = 40;
        System.out.println(x); //40
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
