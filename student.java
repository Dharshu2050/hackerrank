import java.util.*;

public class student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        float cgpa=sc.nextFloat();
        char grade=sc.next().charAt(0);
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("CGPA:" +cgpa);
        System.out.println("Grade:" +grade);

    }
}
