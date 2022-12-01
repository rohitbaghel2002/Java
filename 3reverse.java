import java.util.*;

class reverse {
    public static void main(String[] args) {
        int n;
        int rem, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide a value to reverse");
        n = sc.nextInt();
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.print("The reversed value is: ");
        System.out.print(rev);
        sc.close();
    }
}