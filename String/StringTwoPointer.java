public class StringTwoPointer {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){

        int len = s.length();

        int start = 0;
        int end = len-1;

        while (start < end) {

            if (s.charAt(start) !=  s.charAt(end)) {
                return false;
            }
            start++;
            end--;
            
        }

        return true;
    }
}
