import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ros; // declartion of array.ros is getting defined in memory
        ros = new int[5]; // intialisation: actually here object is being created in the memory
        // [0,0,0,0,0]
        // System.out.println(ros[1]);

        // String[] arr = new String[4];
        // System.out.println(arr[0]); // null

        // // array of primitve;
        // int[] array = new int[5];
        // array[0] = 23;
        // array[1] = 26;
        // array[2] = 45;
        // array[3] = 25;
        // array[4] = 20;
        // // [23,26,45,25,20]
        // System.out.println(array[3]);// 25
        // // input using for loop
        // for (int i = 0; i < array.length; i++) {
        // array[i] = sc.nextInt();
        // }
        // // for (int i = 0; i < array.length; i++) {
        // // System.out.println(array[i]);
        // // }
        // // // output using for-each loop
        // // for (int num : array) {
        // // System.out.println(num + " ");
        // // }
        // System.out.println(Arrays.toString(array)); // it is a method for printing
        // the array but in string
        // // format[_,_,_,]

        // arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        str[0] = "aniket";
        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println(Arrays.toString(str));
        // Arrays are mutable in java
    }

    static void change(String[] str) {
        str[1] = "java";
    }
}
