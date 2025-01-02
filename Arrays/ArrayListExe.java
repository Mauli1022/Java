import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(45);
        list.add(54);
        list.add(34);
        list.add(545);
        list.add(4534);
        list.add(5412);
        

        System.out.println(list.contains(545));

        list.set(0,99);//update list
        list.remove(3);

        // for(int i = 0; i < 5; i++){
        //     list.add(sc.nextInt());
        // }

        // get item at any idex
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);

    }
}
/*
 * Generics
 */
