import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int [] g = {1,2,3};
        int [] s = {1,1};

        System.out.println(findContentChildren(g, s));
    }

    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int l = 0, r = 0 ;

        while (l <= r) {
            if (g[l] >= s[r]) {
                r++;
            }
            l++;
        }
        return r;
    }
}
