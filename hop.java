import java.util.Scanner;

public class hop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=3;
        int b=4;
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x-a;
        int w=y-b;
        int k=z>w?z:w;
        System.out.println(k);
    }
}
