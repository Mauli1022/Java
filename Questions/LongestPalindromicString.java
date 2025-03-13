import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicString {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
        // longestPalindrome(s);
    }

    static String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        // String ans = "";
        HashMap <String,Integer> tempSet = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                String tempStr = s.substring(i, j);
                if (isPalindrom(tempStr)) {
                    tempSet.put(tempStr, tempStr.length());
                }
               
            }
        }

        String ans = tempSet.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())  
                .map(Map.Entry::getKey)           
                .orElse(null);
        return ans;
    }

    /* 
    static boolean isPalindrom(String s) {
        String tempStr = s;
        String[] arrString = s.split("");

        int i = 0;
        int j = arrString.length - 1;

        while (i < j) {
            String temp = arrString[i];
            arrString[i] = arrString[j];
            arrString[j] = temp;
            i++;
            j--;
        }

        String ans = String.join("", arrString);

        return tempStr.equals(ans);
    }
    */

    static boolean isPalindrom(String s){

        int i = 0, j = s.length()-1;

        while (i < j) {
            
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

}
