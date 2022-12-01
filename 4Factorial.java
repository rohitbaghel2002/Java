import java.util.*;

class Prime {
    public static void main(String[] args) {
        int a;
        Scanner Sc = new Scanner(System.in);
        System.out.println("please enter value of a");
        a = Sc.nextInt();
        int fact = 1;
        for (int i = 2; i <= a; i++) {
            fact = fact * i;
        }
        System.out.print(fact);
        Sc.close();
    }
}

;