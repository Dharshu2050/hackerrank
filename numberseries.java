import java.util.Scanner;

public class numberseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=8;i++){
            n +=i;
            if(i%2==0){
                n +=2;
            }
            else{
                n +=6;
                
            }
        }
    }
}
