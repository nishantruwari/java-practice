import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        int n,temp,m=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no >");
        n=sc.nextInt();
        sc.close();
        temp=n;

        while(n!=0)
        {
            int p=n%10;
            m=m+p*p*p;
            n=n/10;

        }
        if(temp==m)
            System.out.println("Armstrong number");
        else
            System.out.println("not an Armstrong number");
    }
    
}
