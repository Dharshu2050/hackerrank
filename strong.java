import java.io.*;
import java.util.*;

public class strong {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,fact=1,sum=0,rem;
        int temp=n;
        while(n!=0){
            i=1;
           fact=1;
           rem=n%10;
            while(i<=rem){
                fact=fact*i;
                i++;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
