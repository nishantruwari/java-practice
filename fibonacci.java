import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        int a=1,b=1,n,c=1;
        System.out.print("Enter number upto which you want fibo series > ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        System.out.println(a);
        while(c<=n){
           // c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
           //10 System.out.println(", "+c);
            
        };
    }
    
}
