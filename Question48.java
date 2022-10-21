import java.util.*;
class Coupon
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    while(k>0){
      int c=0;
      int sum=0;
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      int arr[]=new int[x];
      for(int i=0;i<x;i++)
      {
        arr[i]=sc.nextInt();
        c=c+arr[i];
      }
      for(int i=0;i<x;i++){
        if(arr[i]>z){
          sum=sum+(arr[i]-z);
        }
      }
      int m=y+sum;
      if(m<c)
      {
        System.out.println("COUPON");
      }
      else
      {
        System.out.println("NO COUPON");
      }
      k--;
    }
  }
}
