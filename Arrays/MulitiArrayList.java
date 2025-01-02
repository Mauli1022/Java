import java.util.Scanner;
import java.util.ArrayList;
public class MulitiArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
        // two Array list
        ArrayList<ArrayList<Integer>>  twoDList = new ArrayList<>();

        // initialization of 2 dimentional Array List
        for(int i = 0; i < 3; i++) {
            twoDList.add(new ArrayList<>());
        }   
        
        //add element
        for(int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++) {

                twoDList.get(i).add(sc.nextInt());
                
            }
        }

        System.err.println(twoDList);

        sc.close();
    }
}
