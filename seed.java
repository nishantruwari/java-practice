
//seed number is like 12 and 24 .because 12 *1*2=24
import java.util.Scanner;

public class seed {
    public static void main(String[] args) {
        int n, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        n = sc.nextInt();
        System.out.println("enter number ");
        n2 = sc.nextInt();
        int mul = n, temp = n;
        while (n != 0) {
            int p = n % 10;
            mul = mul * p;
            n /= 10;
        }
        System.out.println("result " + mul);
        if (mul == n2) {
            System.out.println("seed number");
        } else {
            System.out.println("not a seed number");
        }
    }

}
