import java.util.Scanner;

public class fourdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=(a%10)+(a/1000);
        System.out.println(b);
    }
}
