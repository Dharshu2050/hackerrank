import java.io.*;
import java.util.*;

public class collatz {

    public static void main(String[] args) {
        //output 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        System.out.println(n);
        while(n!=1){
            if(n%2==0){
                n=n/2;
                count++;
            }
                
            else{
                 n=3*n+1;
                count++;
            }
            System.out.println(n);
        }   
        System.out.println(count);
    }
    
}