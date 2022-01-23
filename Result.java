import java.util.Scanner;

public class Result {

    public static void main(String[] args) {
        int marks[] = new int[3];
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name > ");
        name = sc.nextLine();
        name = name.toLowerCase();
        int n = name.length();
        // System.out.println(n);
        char[] ch = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = name.charAt(i);
        }

        System.out.println("Enter marks of Subject 1 > ");
        marks[0] = sc.nextInt();
        System.out.println("Enter marks of Subject 2 > ");
        marks[1] = sc.nextInt();
        System.out.println("Enter marks of Subject 3  > ");
        marks[2] = sc.nextInt();
        sc.close();
        // int n = name.length();
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Name > ");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ch[0] = Character.toUpperCase(ch[0]);
            }
            if (ch[i] == ' ') {
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
            }
            System.out.print(ch[i]);
        }
        System.out.println();
        System.out.println("-------------------------Marks --------------------");
        System.out.println("Subject 1 > " + marks[0]);
        System.out.println("Subject 2 > " + marks[1]);
        System.out.println("Subject 3 > " + marks[2]);
        int sum = marks[0] + marks[1] + marks[2];
        System.out.println("Total marks >" + sum);
        float percentage = sum * 100 / 300;
        System.out.println("Percentage > " + percentage + "%");
        if (percentage >= 90) {
            System.out.println("A Grade ");
        } else if (percentage < 90 && percentage >= 80) {
            System.out.println("B Grade ");
        } else if (percentage < 80 && percentage >= 70) {
            System.out.println("C Grade ");
        } else if (percentage < 70 && percentage >= 60) {
            System.out.println("D Grade ");
        } else if (percentage < 60) {
            System.out.println("E Grade ");
        }

    }

}
