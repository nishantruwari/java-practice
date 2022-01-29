import java.util.Scanner;
import java.lang.Math;

public class series1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println((int) (Math.pow(2, i)) + ",");
        }
    }

}
