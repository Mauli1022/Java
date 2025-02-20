// https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
public class CheckString {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(checkString(s));
    }
    static boolean checkString(String s){

        boolean ans = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                ans = true;
            }
            if(ans){
                if(s.charAt(i)=='a'){
                    return !ans;
                }
            }
        }
        return true;
    }
}
