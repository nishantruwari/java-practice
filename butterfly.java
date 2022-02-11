import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a odd number > ");
        n = sc.nextInt();
        int count = 0, lount = n - 1;
        // int count = 0, lount = 12;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= count || i + j >= lount) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            count = count + 2;
            System.out.println();
        }
        count = n / 2;
        lount = n / 2;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= count || i + j >= lount) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            lount = lount + 2;
            System.out.println();
        }

    }
}
