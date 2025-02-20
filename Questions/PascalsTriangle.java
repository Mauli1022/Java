import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {

        // List<List<Integer>> main = new ArrayList<>(
        //     Arrays.asList(
        //         Arrays.asList(1),
        //         Arrays.asList(1, 1)
        //     )
        // );

        // List <Integer> numbers = new ArrayList<>();

        // int num = 5;

        // Integer[] number2 = { 1, 2, 1 };
        // Integer[] number3 = { 1, 3, 3, 1 };

        // List <Integer> numList = new ArrayList(Arrays.asList(number));
        // List <Integer> numList1 = new ArrayList(Arrays.asList(number1));
        // List <Integer> numList2 = new ArrayList(Arrays.asList(number2));
        // List <Integer> numList3 = new ArrayList(Arrays.asList(number3));

        
        // main.add(new ArrayList<>(Arrays.asList(number2)));
        // main.add(new ArrayList<>(Arrays.asList(number3)));

        System.out.println(pascalsTriangle(5));
        
    }

    static List<List<Integer>> pascalsTriangle (int num){
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < num; i++) {
          Integer[] temp = new Integer[i + 1];
          Arrays.fill(temp, 1);
          ans.add(Arrays.asList(temp));
        }
    
        for (int i = 2; i < num; ++i)
          for (int j = 1; j < ans.get(i).size() - 1; j++)
            ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
    
        return ans;
    }

}
