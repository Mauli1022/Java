public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(50));
        // simpleFibo(50);
    }
    static int fibo(int n){

        // base condition
        if(n < 2){
            return n;
        }
        return fibo( n - 1 ) + fibo( n - 2);

    }

    static int simpleFibo(int n){
        
        int ft = 0;
        int st = 1;

        for(int i=0;i<n;i++){

            int nt = ft + st ;
            System.out.println(ft);
            ft = st;
            st = nt;
        }
        return 1;
    }
}

/*
1 2 3 4 5 6 7 8
0 1 1 2 3 5

ft = 0;
st = 1;

first iteration:
nt = ft + st : 0 + 1;
ft = st = 1
st = nt = 1 

second Iteraion
nt = 1 + 1 = 2
ft = st = 1
st = nt = 2

third iteraion
nt = 1 + 2 = 3
ft = st = 2
st = nt = 3

fourt iteraion 
nt = 2 + 3 = 5 
ft = 3
st = 5

fifth iteraion
nt = 3 + 5 = 8
ft = 5
st = 8

sixth Iteraion
nt = 5 + 8 = 13
ft = 8 
st = 13

 */

/*
 How to understand and approach problem (VVIP)

 1) :identify if we can break down problem in smaller problem
 2) : write the recurrence relation if need 
 3) : drow the recursive tree
 4) : about the tree : 
      1: see the flow of function, how thay are getting in Stack
      2: identify and focuse on left tree calls and right tree calls
      3: draw the tree and pointer again and again using pen and paper
      4: use a debugger to see the flow
5) : see how the values are returned at each step
6) : see where two function call will come out of, in the ind we will come out of main function
 */

/*
 Variables : 
 1) : Arguments 
 2) : Return Type
 3) : Body of function
 */

 /*
 Types of recurrence relation
 1) Linear recurrence relation ---> fibonacci
 2) Dive and conquer relation ---> binary search
    search space is divide by a factor
 */

/*
 Tip : do not over think
 
 */