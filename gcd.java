import java.util.*;
public class gcd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=2,num2;
        int gcd=1;

        System.out.println("Enter the input:");
        num2=sc.nextInt();

        for (int i=1;i<=num1 || i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        int lcm=(num1*num2)/gcd;
        System.out.println("smallest positive integer divisible by both n and 2 is:"+lcm);


    }
}
