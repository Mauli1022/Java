public class AddDigit {
    public static void main(String[] args) {
        int a = 38;

        // int digit = 0 ;
        // int temp = a; 
       
        // while (temp != 0) {
        //     digit += temp % 10;
        //     temp = temp / 10;
        // }
        // System.out.println(digit);

        System.out.println(addDigits(a));
        
    }

    static int addDigits(int num) {
        
        int digit = 0 ;
        int temp = num; 
       
        while (temp != 0) {
            digit += temp % 10;
            temp = temp / 10;
        }

        if (num > 10) {
           return addDigits(digit);
        }
        return digit;
    }
    
}
