public class Fibonacci {

    public static void main(String[] args) {

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 0; i < 12; i++) {
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.println(firstTerm);
        }

    }
}
