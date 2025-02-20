import java.util.Arrays;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "geeks@for@geeks";
        

        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
  
        String ans = ""; 

        String result = s.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();
        String [] temsStrArr = result.split("");

        ans = swapChar(temsStrArr);
        
        if (!ans.equals(result)) return false;

        return true;
    }


    static String swapChar(String [] temsStrArr) {

        int start = 0;
        int end = temsStrArr.length-1;

        while (start < end) {
            String temp = temsStrArr[start];
            temsStrArr[start] = temsStrArr[end];
            temsStrArr[end] = temp;

            start++;
            end--;
        }

        return String.join("", temsStrArr);
    }
}
