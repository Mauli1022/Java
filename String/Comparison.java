public class Comparison {
    public static void main(String[] args) {
        String a = "aman";
        String b = "aman";
        System.out.println(a == b);

        String c = new String("Rohan");
        String d = new String("Rohan");
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println("Char At:"+c.charAt(0));
    }
    
}
