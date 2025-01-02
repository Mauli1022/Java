package BSQuestions;
public class Smallestletter {
    public static void main(String[] args) {

        char [] myCharArr = { 'c', 'f', 'i', 'j'};
        System.out.println(smallestLetter(myCharArr, 'f'));
        // printNum();
    }

    static char smallestLetter(char[] arr, char target){
        int s = 0;
        int e = arr.length-1;

        while (s <= e) {
            // find mid
            int mid = s + (e - s) / 2;


            if (arr[mid]>target) {

                e = mid - 1;
                
            } else {
                s = mid + 1;
            }
        }

        return arr[s % arr.length] ;
    }


    static int  printNum(){

        int num = 0;

        while (num <= 10) {
            System.out.println(num);
            num ++;
        }

        return 1;

    }
}
