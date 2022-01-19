import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter number >");
        int n=sc.nextInt();
        sc.close();
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0){
                flag++;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime number ");
        }
        else
            System.out.println(" not a prime number");

    }
    
}
