package hacktober;
import java.util.Scanner;
import java.lang.*;
public class Question_6 
{
	public static String Tanu(String s,int n,String str)
	{
		/*to get smallest string Tanu adds 0 at the beginning and 1 at the end of new string*/
		char ch=s.charAt(0);
		if(ch=='0')
		{
			str=s.charAt(0)+str;
		}
		if(ch=='1')
		{
			str=str+s.charAt(0);
		}
		
		return str;
	}
	public static String Manu(String s,int n,String str)
	{
		/*to get largest string Manu adds 1 at the beginning and 0 at the end of new string*/
		char ch=s.charAt(n-1);
		if(ch=='0')
		{
			str=str+s.charAt(n-1);
		}
		if(ch=='1')
		{
			str=s.charAt(n-1)+str;
		}
		return str;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int flag=1;
		String s,T="";
		int t,n,m,j;
		do {
		t=sc.nextInt();    //taking in the number of test cases
		flag=0;
		if(t<1 || t>100)		//checking t is within range
		{
			System.out.println("this input can't be accepted\nthe value of test cases must be between 1 to 100\nre-enter appropriate value");
			flag=1;
		}
		}while(flag==1);
		for(int i=0;i<t;i++)	
		{
			T="";
			int f=1;
			do {
			n=sc.nextInt();  //taking in size of string
			f=0;
			if(n<1 || n>1000)	//making sure size is within range
			{
				System.out.println("this input can't be accepted\nthe size of String must be between 1 to 1000\nre-enter appropriate value");
				f=1;
			}
			}while(f==1);
			s=sc.next();	//taking in value of string
			if(s.length()!=n)
				System.out.println("size entered doesn't match the string entered");
			/*each method tanu and manu is called n/2 times*/
			
			for(j=0;j<(n/2);j++)
			{
				T=Tanu(s,s.length(),T);
				s=s.substring(1,s.length());
				T=Manu(s,s.length(),T);
				s=s.substring(0,s.length()-1);
			}
			if(n%2!=0) //if n is odd then tanu method is called another time
			{
				T=Tanu(s,n,T);
				s=s.substring(1,s.length());
			}
			System.out.println("output for test case "+(i+1)+"-"+T);
		}
		sc.close();
		}
		
}

