public class SwappingFunc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println(a + " " + b);
        swap(a, b);
        System.out.println("a: " + a + " " + "b: " + b);
        String name = "Aniket Barai";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Rohit Sharma";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
