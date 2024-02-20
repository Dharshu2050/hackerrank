import java.util.Scanner;

public class fencing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int area=l*b;
        int perimeter=2*(l+b);
        System.out.println("The required length is "+area+"m");
        System.out.println("The required area of carpet id"+perimeter+"sqm");
    }
}
