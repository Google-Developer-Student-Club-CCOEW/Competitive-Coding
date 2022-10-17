import java.util.*;
public class Question9{
    public static void main(String args[]){
       Scanner in=new Scanner(System.in);
       int a,b,s,d;
       a=in.nextInt();
       b=in.nextInt();
       s=a-b;
       d=b-a;
       int s1=s;
       int d1=d;
       if((s1-s)==0 && s%2==0)System.out.println("Yes");
       else if((d1-d)==0 && d%2==0)System.out.println("Yes");
else 
System.out.println("No");
    }
}