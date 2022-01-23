
// to change in camel case nishant ruwari>>> Nishant Ruwari
import java.util.Scanner;

public class stringcase {

    public static void main(String[] args) {
        String name;
        System.out.println("Enter name > ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        name = name.toLowerCase();
        sc.close();
        int n = name.length();
        System.out.println(n);
        char[] ch = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = name.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ch[0] = Character.toUpperCase(ch[0]);
            }
            if (ch[i] == ' ') {
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
            }
            System.out.print(ch[i]);
        }
    }

}
