// https://leetcode.com/problems/length-of-last-word/description/

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        // System.out.println(lengthOfLastWord(s));
        // lengthOfLastWord(s);
        s = s.strip();
        System.out.println(s);
    }
    static int lengthOfLastWord(String s){

        int len = 0;
        
        s = s.strip();

        for(int i = s.length()-1; i >= 0 && s.charAt(i) != ' '; i--){
            len++;
        }

        return len;
    }
}
