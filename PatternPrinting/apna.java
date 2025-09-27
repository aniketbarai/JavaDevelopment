public class apna {
    public static void main(String[] args) {
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
        System.out.println();
        pattern5();
        System.out.println();
        pattern6();
        System.out.println();
        pattern7();
        System.out.println();
        pattern8();
        System.out.println();
        pattern9();
    }

    static void pattern9() {
        // 0-1 triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    static void pattern8() {
        // Floyd's Triangle
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    static void pattern7() {
        // inverted half pyramid with nums
        // for (int i = 5; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern6() {
        // half pyramid with nums
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern5() {
        // invert with 180deg half pyramid
        // outer loop
        for (int i = 1; i <= 4; i++) {
            // inner loop -> spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // inner loop -> stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        // invert -half pyramid
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4 - i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        // half pyramid
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        // hollow rectangle
        // outer loop -> for rows
        for (int i = 1; i <= 4; i++) {
            // inner loop -> for cols
            for (int j = 1; j <= 5; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern1() {
        // solid rectangle
        // outer loop -> for rows
        for (int i = 0; i < 4; i++) {
            // inner loop -> for cols
            for (int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
