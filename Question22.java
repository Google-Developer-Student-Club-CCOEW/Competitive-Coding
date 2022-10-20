import java.util.*;
class Solution{
  public static double solve(int[] arr,int n,int m)
  {
    if(n==m){
      double sum=0;
      for(int i =0;i<n;i++)
        sum+=arr[i];
        return sum;
    }
    else{
      double sum=0f;
      double max=Integer.MIN_VALUE;
      for(int i=0;i<n;i++)
        sum+=arr[i];
      for(int i=0;i<n-1;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          double tem = sum-(arr[i]+arr[j]);
          double temp=(arr[i]+arr[j])/2.0;
          if((tem+temp)>max)
          {
            max=tem+temp;
          }
        }
      }
      return max;
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    for(int x=1;x<=testcase;x++)
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        double sol = solve(arr,n,m);
        System.out.println("Case #"+x+":"+sol);
    }
  }
}
     
