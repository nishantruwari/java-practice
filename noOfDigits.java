import java.util.Scanner;

public class noOfDigits {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number >");
        num = sc.nextInt();
        int count = 0;
        if (num == 0) {
            System.out.println("number of digits =1");
        } else {

            while (num != 0) {
                count++;
                num /= 10;
            }

            System.out.println("Number of digits = " + count);
        }
    }

}
