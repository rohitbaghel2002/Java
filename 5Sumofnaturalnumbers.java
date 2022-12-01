import java.util.*;

class sum {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide a value");
        n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.print(sum);
        sc.close();
    }
}
