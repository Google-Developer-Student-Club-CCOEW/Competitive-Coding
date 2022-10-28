import java.util.*;

public class votingCount {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		String Candi[]=new String[100];
		String vote[]=new String[100];	
		int invalidCount=0, flg=0;

		//		taking input
		int N=sc.nextInt();
		int Vcount[]=new int[N];
		for(int Vc=0;Vc<N;Vc++) {
			Vcount[Vc]=0;
		}
		
		for(int n=0; n<N ; n++) {
			Candi[n]=sc.next().toUpperCase();

		}

		int V=sc.nextInt();
		for(int v=0; v<V; v++) {
			vote[v]=sc.next().toUpperCase();
			flg=0;
			for(int i=0;i<N;i++) {
				if(vote[v].equals(Candi[i])){
					Vcount[i] +=1;
					flg=1;
//					System.out.println(Vcount[i]);
				}		
			}
			if(flg==0) {
				invalidCount +=1;
			}
		}
		
		for(int Vc=0;Vc<N;Vc++) {
			System.out.print(Candi[Vc]+"="+Vcount[Vc]+" ");		
			}
		
		//sorting
		for (int i = 0; i < Vcount.length; i++) {			 
            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < Vcount.length; j++) {
 
                // Checking elements
                int temp = 0;
                String tempp=null;
                if (Vcount[j] < Vcount[i]) {
 
                    // Swapping
                    temp = Vcount[i];
                    Vcount[i] = Vcount[j];
                    Vcount[j] = temp;
                    
                    tempp = Candi[i];
                    Candi[i] = Candi[j];
                    Candi[j] = tempp;
                    
                }
            }
		}
		
		System.out.println("invalid votes= "+invalidCount);
            
		//winner
		System.out.println("Winner "+Candi[N-1]);


	}
}
