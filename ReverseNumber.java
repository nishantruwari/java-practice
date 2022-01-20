import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        int n,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no >");
        n=sc.nextInt();
        sc.close();
        while(n!=0)
        {
            int p=n%10;
            rev=rev*10+p;
            n=n/10;
        }
        System.out.println("Reverse > "+rev);
    }
    
}
