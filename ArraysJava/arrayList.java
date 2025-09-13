import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(3);
        // list.add(28);
        // list.add(8);
        // list.add(21);
        // list.add(22);
        // list.add(24);
        // list.add(26);
        // list.add(29);
        // System.out.println(list.contains(2));
        // System.out.println(list);
        // list.set(1, 45);
        // list.remove(2);
        // System.out.println(list);
        Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 5; i++) {
        // list.add(sc.nextInt());
        // }
        // for (int i = 0; i < 5; i++) {
        // System.out.println(list.get(i));// list[index] syntax will not work here
        // }
        // System.out.println(list);

        // We can also define Multi-Dimensonal ArrayList
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
        // initialisation
        for (int i = 0; i < 3; i++) {
            list2D.add(new ArrayList<>());
        }
        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2D.get(i).add(sc.nextInt());
            }
        System.out.println(list2D);
    }
     public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    int count = 0;
    for (int i = 0; i < ar.size(); i++) {
        for (int j = i+1; j < ar.size(); j++) {
            //this below statement checks the condition..
            if((ar.get(i)+ar.get(j)) % k == 0){
                count++; //when condition met increment by 1 
            }
        }
    }
    return count;
    }
        }
}

