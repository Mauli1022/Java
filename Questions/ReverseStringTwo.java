public class ReverseStringTwo {
    public static void main(String[] args) {
        String s = "abcdef";
        int k = 2;

        System.out.println(reverseStr(s, k));
    }

    static String reverseStr(String s, int k) {

        String [] tempArr = s.split("");
        int start = 0;

        while (start < tempArr.length) {

            int end = Math.min(start + k - 1, tempArr.length - 1);
            swapChar(tempArr, start, end);
            start += 2 * k;
        }
    
        return String.join("", tempArr);
    }

    static void swapChar(String [] str, int s, int e){

        while (s < e) {
            
            String temp = str[s];
            str[s] = str[e];
            str[e] = temp;

            s++ ;
            e--;
        }
        // return str;
    }
}
