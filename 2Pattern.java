import java.util.*;

class Pattern {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int i, k, n;
        System.out.println("Enter the value of N");
        n = Sc.nextInt();
        for (i = 0; i < n; i++) {
            for (k = 0; k <= i; k++) {
                if (k % 2 == 0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
        Sc.close();
    }
}