import java.util.Scanner;
class Finder {
	int[] getpref(int[] pref) {
		int arr[]=new int[pref.length];
		int b=pref[0];
		arr[0]=b;
			for(int i=1;i<pref.length;i++) {
				for(int j=0;j<10;j++) {
					if((b^j)==pref[i]) {
						arr[i]=j;
						b=(b^j);
						break;
					}
				}
			}
			return arr;
	}
}
public class xorer {
	public static void main(String[] args) {
		Finder ob=new Finder();
		Scanner sc= new Scanner(System.in);
//		int[] pref= {5,2,0,3,1};
		
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int[] pref= new int[n];
		System.out.println("Enter elements:");
		
		for(int i=0;i<n;i++) {
			System.out.print(">");
			pref[i]=sc.nextInt();
		}
		int[] arr=ob.getpref(pref);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
