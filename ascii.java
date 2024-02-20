import java.util.Scanner;
//char into number
public class ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int d=(int)c;
        System.out.println(d);

        //number into char
        int n=sc.nextInt();
        char g=(char)n;
        System.out.println(g);

    }
}
