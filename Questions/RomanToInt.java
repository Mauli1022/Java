import java.util.HashMap;
public class RomanToInt {
    public static void main(String[] args) {
        String s = "III";

        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s){
        HashMap <Character, Integer> romanString = new HashMap<>();
        romanString.put('I',1);
        romanString.put('V', 5);
        romanString.put('X', 10);
        romanString.put('L', 50);
        romanString.put('C', 100);
        romanString.put('D', 500);
        romanString.put('M', 1000);


        int ans = 0;

        for(int i=0;i<s.length();i++){

            if(i+1<s.length() && romanString.get( s.charAt(i) ) < romanString.get( s.charAt(i+1) ) ){
                ans = ans - romanString.get(s.charAt(i));
            }else{
                ans = ans + romanString.get(s.charAt(i));
            }
        }

        // System.out.println(romanString);

        return ans;
    }
}
