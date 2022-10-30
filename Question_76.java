package hacktober;
import java.util.*;
import java.lang.*;
public class Question_76 
{
	public static char right(String s,char p)
	{
		if(p=='N')
			p='E';
		else if(p=='E')
			p='S';
		else if(p=='S')
			p='W';
		else if(p=='W')
			p='N';
		return p;
	}
	public static char left(String s,char p)
	{
		if(p=='N')
			p='W';
		else if(p=='E')
			p='N';
		else if(p=='S')
			p='E';
		else if(p=='W')
			p='S';
		return p;
	}
	public static void main(String [] args)
	{
		char Professor='N';
		char Tokyo='S';
		int T,N,flag=1,sum=0;
		String S;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of test cases-");
		do 
		{
			T=sc.nextInt();    //taking in the number of test cases
			flag=0;
			if(T<1 || T>100)		//checking t is within range
			{
				System.out.println("this input can't be accepted\nthe value of test cases must be between 1 to 100\nre-enter appropriate value");
				flag=1;
			}
		}while(flag==1);
		for(int i=0;i<T;i++)
		{
			Professor='N';
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
					if(S.charAt(k)!='L' && S.charAt(k)!='R')	//making sure string only includes L and R
					{
						f1=1;
					}
				}
				if(f1==1)
				{
					System.out.println("this String can't be accepted. the string should only contain 'L' or 'R'\nplease reenter appropriate string");
				}
			}while(f1==1);
			sum=sum+N;
			if(sum>1000000)			//checking the sum of N is within range
			{
				System.out.println("the sum of string length for all test cases should be below 10^6");
			}
			else {
			for(int j=0;j<N;j++)
			{
				if(S.charAt(j)=='L')
				{
					Professor=left(S,Professor);
				}
				else if(S.charAt(j)=='R')
				{
					Professor=right(S,Professor);
				}
			}
			if(Professor==Tokyo)
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");
			}
		}
		
	}

}
