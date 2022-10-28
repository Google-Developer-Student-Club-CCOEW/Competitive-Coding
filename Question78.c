#include<stdio.h>
int main()
{
  int t;
  while(t--)
  {
    int n,a,b,even=0,odd=0,ans,d;
    scanf("%d %d %d",&n,&a,&b);
    d=n;
    for(int i=2;i*i<=n;i++){
      while(n%i==0){
        n=n/i;
        if(i%2==0){
          even++;
        }
        else{
          odd++;
        }
      }
    }
    if(n>1){
      if(n%2==0){
        even++;
      }
      else{
        odd++;
      }
    }
    if(a>=0 && b>=0){
      ans=a*even+b*odd;
    }
    else if(a>=0 && b<0){
      if(even>0){
        ans=a*even;
      }
      else{
        ans=b;
      }
    }
    else if(a<0 && b>=0){
      if(even>0){
        ans=b*odd+a;
      }
      else{
        ans=b*odd;
      } 
    }
    else{
      if(d%2==0){
        ans=a;
      }
      else{
        ans=b;
      }
    }
    printf("%d\n",ans);
  }
  return 0;
}
