public class ArraysIntro {
    public static void main(String[] args) {
        // Syntax : 
        // data_type [] variable_name = new data_type[size];

        // int [] rnos = new int[5];
        // int [] rns2 = {12,45,65,23,78,65};

        int [] rnos ; // declaration of array . rnos is getting defined in the stack
        rnos = new int[5]; //Initialisation : actual here object is being created in the memory(heap);

        // System.out.println(rnos[0]);

        // String [] arr = new String[4];
        // System.out.println(arr[0]);

    }
}

/*

premitive and non-premitive
The difference between primitive and non-primitive data types are as follows: Primitive types are 
predefined in Java. Non-primitive types are created by the programmer and is not defined by Java

Stack and Heap memeory:
primitive data types are stored in stack memeory
and non-primitive data types are stored in heap memeory

*** In Java There is only Call By value
---------------------------------------------------------------------------------------------------
 * java architecture : 
 * array object are in heap
 * heap object are not continuous
 * DMA
 
 new Keyword :
 is used to create an object 
 new int[5] it will create an object in heap memory of int 5;
 */
