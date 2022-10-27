import java.util.*;

public class que54 {
	public static void main(String[] args) {
		int T,N;
		int[] arr = new int[100];
		int[][] OP_each=new int[100][100];
		int count;
		Scanner sc = new Scanner(System.in);		
		T = sc.nextInt();
		
		for(int tstCase = 0; tstCase < T; tstCase++) {		
			//input
			N = sc.nextInt();
			for(int IParr = 0; IParr < N; IParr++) {
				arr[IParr]= sc.nextInt();
			}
			
			//counting
			count=1;
			for(int i=0; i<N;i++) {
				for(int arrIndex=i+1; arrIndex<N; arrIndex++) {
					if(arr[arrIndex-1]*arr[arrIndex]<0) {
						count += 1;
					}	
					else {
						break;
					}
				}
				OP_each [tstCase][i]=count;
				count=1;
			}
			
			for(int i=0;i<N;i++) {
				System.out.print(OP_each[i]);
			}
			System.out.println("");
		}		
		sc.close();
	}

}
