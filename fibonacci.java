import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        int i=2;
       
            while(i<n){
               c=a+b;
               a=b;
               b=c;
               i++;


            }
            System.out.println(c);

        

    }
}
