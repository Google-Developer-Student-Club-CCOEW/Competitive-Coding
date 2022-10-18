import java.util.*;
public class MaxColour {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();//accept no of test cases
		int color=0;
		while(testcase>0) {
			color=0;
			int x=sc.nextInt(); //no of red drops
		    int y=sc.nextInt(); //no of green drops
		    int z=sc.nextInt(); //no of blue drops
		    if(x>=1) color++; //with 1 drop 1 color is possible
		    if(y>=1) color++;
		    if(z>=1) color++;
		    int a[]=new int[3];
		    a[0]=x;
		    a[1]=y;
		    a[2]=z;
		    Arrays.sort(a);
		    int maxcolor=color;
		    if(a[1]>1 && a[2]>1){ //check if cyan color is possible
		        a[1]--;
		        a[2]--;
		        maxcolor=maxcolor+1;
		    }
		    if(a[0]>1 && a[2]>1){ //check if  magenta color is possible
		        a[0]--;
		        a[2]--;
		        maxcolor=maxcolor+1;
		    }
		    if(a[0]>1 && a[1]>1){ //check if yellow color is possible
		        a[0]--;
		        a[1]--;
		        maxcolor=maxcolor+1;
		    }
		    testcase--;
		    System.out.println(maxcolor);
		}
		sc.close();
	}
}
