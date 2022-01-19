import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number > ");
        int n=sc.nextInt();
        sc.close();
        int sum=0,c;
        while(n>0)
        {
             c=n%10;
            n=n/10;
            sum=sum+c;
        }
        System.out.println(" sum of digits >"+sum);
    }
    
}
