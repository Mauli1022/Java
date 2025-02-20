public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] stringArr = {"flower","flow","flight"};
        System.out.println(newLongestCommonPrefix(stringArr));
    }


    static String newLongestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0];
        System.out.println("Index of"+strs[1].indexOf(prefix));
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
    
}

/*
 Initialize the Prefix:
Start by assuming the first string in the array (strs[0]) is the longest common prefix.

Iterate Through Remaining Strings:
For each subsequent string in the array, compare it with the current prefix.

Reduce the Prefix Until It Matches:

Check if the current string begins with the prefix.
If it doesn't, reduce the prefix by removing the last character.
Keep repeating this until either:
a) The prefix matches the start of the current string.
b) The prefix becomes empty, in which case there is no common prefix.
Return the Result:
After checking all strings, the remaining prefix (if any) is the longest common prefix.
If the prefix is empty, return an empty string.


 */