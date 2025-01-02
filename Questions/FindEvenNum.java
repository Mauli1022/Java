// 1295. Find Numbers with Even Number of Digits

public class FindEvenNum {
    public static void main(String[] args) {
        int [] arr = {12,345,2,67,7896};

        // System.out.println(6/2 == 0);
        System.out.println(findNumbers(arr));
        // System.out.println(digits(0));
        System.out.println(digits2(-9823));

        // int num = 123;
        // System.out.println(num % 2 == 0);
    }



    static int findNumbers(int [] nums){
        
        int count = 0 ;

       for (int num : nums) {
        if(even(num)){
            count++;
        }
       }
        return count;
    }

    // function to check whether a number contain even digits or not 
    static boolean even(int num){
        int numberOfDigits = digits(num);
        // if(numberOfDigits % 2 == 0){
        //     return true;
        // }
        // return false;

        return numberOfDigits % 2 == 0;
    }

    // Function to count digits in the given number
    static int digits(int num){

        if(num < 0){
            num = num * -1;
        }

        if(num == 0 ){
            return 1;
        }
        int count = 0;

        while (num > 0) {
            count ++;
            num = num / 10;
        }

        return count;
    }

    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }

        if(num == 0 ){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    } 

}

/*
 * 
 * Given an integer array nums, 
 * return true if any value appears more than once in the array, otherwise return false.
 */