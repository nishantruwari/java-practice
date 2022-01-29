import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.println("Enter year ");
        year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year ");
                } else {
                    System.out.println("Not a leap year");
                }
            }
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap Year");
        }
    }
}
