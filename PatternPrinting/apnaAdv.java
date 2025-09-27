class apnaAdv {
    public static void main(String[] args) {
        // butterfly();
        // apna a = new apna();
        // a.pattern5();
        // rhombus();
        // numPyramid();
        // palindromePyramid();
        diamond();

    }

    static void butterfly() {
        int n = 6;
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int s = 0; s < 2 * (n - i); s++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= i; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int s = 0; s < 2 * (n - i); s++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= i; p++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void rhombus() {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int s = n; s > 0; s--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void numPyramid() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= i; s++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void palindromePyramid() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("  ");
            }
            for (int s = i; s >= 1; s--) {
                System.out.print(s + " ");
            }
            for (int s = 2; s <= i; s++) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    static void diamond() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            for (int p = 2; p <= i; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            for (int p = 2; p <= i; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}