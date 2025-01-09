public class Recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){

        // Base Condition
        if(n == 5){
            System.out.println(5);
            return;
        }

        System.out.println(n);
        print(n + 1);
    }
}
// note
// if we are calling a function again and again 
// we can treat it as saperate call in the stack
/*
Recursion : Function calling itself.

Why Resursion:
1: It help us in solving bigger/complex problem in simple way.
2: we can convert recursion solution's into iterations and vise versa
3: Space Complexity is not constant beacous of recursion calls

Recursion Tree

Que 1: find nth fibonacci Number

How to identify if problem can be solved by Recursion 
1) Break it down into smaller problem
note : fibo(n) = fibo(n-1) + fibo(n-2)
THis is Known as recurrence relation

2) Base Condition is represented by answers we have 
in this case we know fibo(0) = 0; and fibo(1) = 1;
this is base conditon 

3) try to figureOut Recursive Tree


 */