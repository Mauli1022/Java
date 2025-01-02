public class SearchInStrings {
    public static void main(String[] args) {
        String str = "kunal";
        char target = 'u';

        // System.out.println(search(str, target));
        System.out.println(search1(str, target));
    }


    static boolean search1(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for ( char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }
        }
        return false;
    }


    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
