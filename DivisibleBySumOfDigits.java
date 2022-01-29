import java.util.Scanner;

public class DivisibleBySumOfDigits {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        n = sc.nextInt();
        int q = n;
        int sum = 0;
        while (n != 0) {
            int p = n % 10;
            sum = sum + p;
            n /= 10;
        }
        if (q % sum == 0) {
            System.out.println("Divisible");

        } else {
            System.out.println("nope not divisible");
        }

    }
}
