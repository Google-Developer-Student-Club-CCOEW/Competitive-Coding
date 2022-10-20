class Solution {
public:
    bool isHappy(int n) {
        int sum;
   
        if(n<10)
        {
            if(n==1 || n==7)
                return true;
            return false;
        }    
        while(n>9)
        {
            sum=0;
            int r=0;
            while(n!=0)
            {
                r = n%10;
                sum = sum + (r*r);
                n=n/10;
            }
            n=sum;
        }
        if(n==1 || n==7)
            return true;
        return false;
    }
};

int main(){
  int n;
  cin>>n;
  cout<<obj.isHappy(n)<<endl;
  
}
