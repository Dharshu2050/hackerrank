import java.util.Scanner;
//number roundoff using ceil and floor function
public class roundoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        
        System.out.println((int)f);
        System.out.println((int)Math.ceil(f));
        System.out.println((int)Math.floor(f));

    }
}
