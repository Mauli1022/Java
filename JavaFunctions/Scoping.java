public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // randon(234);

        String name = "kunal";


        // Block Scope
        {
            // we Cannot make new variable with same name but we can
            // change its value

            a = 178; //already initialised outside the block 
            // in the same method hence you cannot initialised again
            // reassign the originl ref variable to some other value
            System.out.println(a);

            int c = 23;
            // Values initialised in this block will remained in this block

            name = "Rahul";
            // here original value is being used
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c); //cannot use outside tha block


        // Scoping in for loop
        for(int i=0;i<4;i++){
            System.out.println(i);
            int sum = 20;
        }
        // System.out.println(sum);
    }

    static void randon(int mark) {
        int num = 123;
        // System.out.println(mark);
    }
}
/*
 * any thing that is initialized outside can be used inside the block 
 * but any thing is initialized inside cannot be used outside block
 * 
 * any thing that is initialized outside cannot be initialized inside the block
 * but anything that is initialized inside the block can be initialized outside the bock
 */