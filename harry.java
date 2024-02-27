import java.util.Scanner;

public class harry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=Math.abs(n);
        int c=n%10;
        int e=n/1000;
        System.out.println(c+e);


    }
}
