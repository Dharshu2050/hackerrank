import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for( int i=0;i<=n;i++){
            if(n/1==0 && n/n==0){
                count++;
                System.out.println(count);

            }
            else{
                System.out.println("not prime");
            }
        }
    }
}
