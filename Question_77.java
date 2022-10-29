package hacktober;

import java.util.*;
import java.lang.*;
public class Question_77 
{
	public static void main(String [] args)
	{
		int T,N,flag=1,sum=0,pair=0;
		String S;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of test cases-");
		do 
		{
			T=sc.nextInt();    //taking in the number of test cases
			flag=0;
			if(T<1 || T>1000)		//checking t is within range
			{
				System.out.println("this input can't be accepted\nthe value of test cases must be between 1 to 100\nre-enter appropriate value");
				flag=1;
			}
		}while(flag==1);
		for(int m=0;m<T;m++)
		{
			pair=0;
			int f=1;
			do {
			N=sc.nextInt();  //taking in size of string
			f=0;
			if(N<2 || N>10000)	//making sure size is within range
			{
				System.out.println("this input can't be accepted\nthe size of String must be between 1 to 10000\nre-enter appropriate value");
				f=1;
			}
			}while(f==1);
			int f1=1;
			do {
				f1=0;
				S=sc.next();
				for(int k=0;k<N;k++)
				{
					int q=Character.getNumericValue(S.charAt(k));  //checking for non numeric characters
					if(q<0 || q>9)
					{
						f1=1;
					}
				}
				if(f1==1)
				{
					System.out.println("this String can't be accepted. the string should only contain numbers between 0 to 9");
				}
			}while(f1==1);
			sum=sum+N;
			if(sum>2000000)			//checking the sum of N is within range
			{
				System.out.println("the sum of string length for all test cases should be below 2*10^6");
			}
			else {
				
				for(int i=0;i<N;i++)
				{
					for(int j=i+1;j<N;j++)
					{
						String y=""+S.charAt(i);
						String z=""+S.charAt(j);
						int Si=Integer.parseInt(y);
						int Sj=Integer.parseInt(z);
						int s1=(j+1)-(i+1);
						if(s1==(Sj-Si) || s1==(Si-Sj))
						{
							pair++;
						}
					}
				}
				System.out.println(pair);
			}
		}
	}

}
