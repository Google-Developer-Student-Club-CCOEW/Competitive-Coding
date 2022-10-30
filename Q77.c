#include <stdio.h>
#include <stdlib.h>

int main()
{
    int t;
    scanf("%d",&t);
    for(int k=0;k<t;k++)
    {
        int n;
        scanf("%d",&n);
        char s[n+1];
        scanf("%s",&s);
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(n>=1 && (s[i+1]-s[i]== 1 || s[i+1]-s[i]== -1 ))
                    c++;
            if(n>=2 && (s[i+2]-s[i]== 2 || s[i+2]-s[i]== -2 ))
                    c++;
            if(n>=3 && (s[i+3]-s[i]== 3 || s[i+3]-s[i]== -3 ))
                    c++;
            if(n>=4 && (s[i+4]-s[i]== 4 || s[i+4]-s[i]== -4 ))
                    c++;
            if(n>=5 && (s[i+5]-s[i]== 5 || s[i+5]-s[i]== -5 ))
                    c++;
            if(n>=6 && (s[i+6]-s[i]== 6 || s[i+6]-s[i]== -6 ))
                    c++;
            if(n>=7 && (s[i+7]-s[i]== 7 || s[i+7]-s[i]== -7) )
                    c++;
            if(n>=8 && (s[i+8]-s[i]== 8 || s[i+8]-s[i]== -8 ))
                    c++;
            if(n>=9 && (s[i+9]-s[i]== 9 || s[i+9]-s[i]== -9 ))
                    c++;
        }
        printf("%d\n",c);
    }
}
