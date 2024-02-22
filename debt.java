import java.util.*;
public class debt {
    public static void main(String[] args){

      Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float n=sc.nextFloat();
        float r=sc.nextFloat();
        double d=p*n*r/100;
        double e=d+p;
        double f=0.02f*p;
        double x=f-e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(x);

    }
}
