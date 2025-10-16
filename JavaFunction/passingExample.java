public class passingExample {
    public static void main(String[] args) {
        String germanShepherd = "Dhruv Rathe";
        greet(germanShepherd);
        System.out.println(germanShepherd);
        // In java there is no PASS BY REFERNCE
        // In java there is only PASS BY VALUE
    }

    static void greet(String naam) {
        // strings are immutable
        naam = "Rahul Tewatia";
        // naam is method scope value so it cant be acces outside of this func

    }
    // Primitives : int,short,byte,char... --> just passing value
    // Objects & Stuffs(complex): passing value only but passing value of the
    // reference variable

}
