public class ReverseString {
    public static void main(String[] args) {
        // char [] myChar = { 'h','e','l','l','o' };
        String myStr = "Hello, World, From JavaScript";
        // revString(myStr);
        // System.out.println(reverseString(myChar););
        // reverseString(myChar[0]);

        System.out.println(revString(myStr));

    }
    static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while (start < end) {

            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    static String revString(String str){

        String [] strArr = str.split(" ");
        String ans = "";


        for (int i = 0; i < strArr.length; i++) {
            ans = ans + " " + swapChar(strArr[i]);
        }
        return ans;
    } 

    static String swapChar(String str){

        String ans;

        String [] tempStrArr = str.split("");

        int s = 0;
        int e = tempStrArr.length-1;

        while (s < e) {

            String temp = tempStrArr[s];
            tempStrArr[s] = tempStrArr[e];
            tempStrArr[e] = temp;

            s++;
            e--;
        }
         
        return ans = String.join("", tempStrArr);
    }
}
