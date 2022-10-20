#include<bits/stdc++.h>

using namespace std ;

int sum_of_digits(string &n)

{

    int len = n.length();

    int sum = 0;

    for(int i = 0 ; i < len ; i++)

    {

        sum = sum + (n[i]-48) ;

        

    }

    return sum ;

}

string convert(string &n)

{  

    string new_str;

    int len = n.length();

    int req_digit = 9 - sum_of_digits(n)%9;

    if(req_digit == 9)

    {     

        

        n.insert(1 , "0");

    }

    else

    {

         int flag = 0 ; 

         char s = req_digit+48;

         for(int i =0 ; i < len ; i++)

        {

            if(s < n[i] && flag ==0 )

            { 

                

               flag = 1;

               n.insert(i,string(1,s));

                break;

            }

             

        }

          if(flag ==0  )

          n.insert(len,string(1,s));

        

         

        

    }

        

    return n;    

    

}

int main()

{

    int t ;

    cin >> t;

    for(int i =1 ; i <= t ; i++)

    {

        string  n ;

        cin >> n ;

        n = convert(n);

        cout <<"Case #"<<i <<": " << n << "\n";

    }

}

