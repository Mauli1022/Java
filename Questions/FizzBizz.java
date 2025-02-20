import java.util.ArrayList;
import java.util.List;

public class FizzBizz {
    
    public static void main(String[] args) {
        int n = 15;

        System.out.println(fizzBuzz(n));
    }
    static List<String> fizzBuzz(int n) {
        List <String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            
            if( i % 3 == 0){
                ans.add("Fizz");
            }else if( i % 5 == 0){
                ans.add("Bizz");
            }else if(i % 3 == 0 && i % 5 == 0 ){
                ans.add("FizzBizz");
            }else{
                ans.add(String.format("%d", i));
            }
        }
        return ans;
    }
}
