public class Oveloading {
    public static void main(String[] args) {
        // Function OverLoading
        // run(23);
        // run("Aman",34);
        long res = fun(12, 23, 54);
        int newRes = fun(12, 443);
        System.out.println(res);
        System.out.println(newRes);

    }

    // Function overloading is when there exist two or more function
    // with same name but different arguments also different number of arguments
    static void run(int a){
        System.out.println(a);

    }
    static void run(String a, int b){
        System.out.println(a+ "\t" + b);
    }

    static int fun(int a, int b){
        return a+b;
    }
    static long fun(int a, int b,int c){
        return a+b+c ;
    }
}
