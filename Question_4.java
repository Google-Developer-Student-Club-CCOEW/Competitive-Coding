public class Question_4 {

	public static int xorAllNums(int[] nums1, int[] nums2) {
        int ans=0;			//if num1 length and num2 length is even: return 0;
        if((nums1.length &1)==1) {		//if length of num1 is odd then adding the bitwise xor of element
        	for(int i:nums2) 
        		ans^=i;
        }
        	
        if((nums2.length &1)==1) {		//if length of num2 is odd then adding the bitwise xor of element
        	for(int i:nums1) 
        		ans^=i;
        }
        return ans;			//return the xor of the 
    }
	public static void main(String[] args) {
		// Input
		
	    int num1[] = { 2,1,3 };		//first array
	    int num2[] = {10,2,5,0 };	//second array
	    System.out.println(xorAllNums(num1, num2));		//calling the function
	}

}

//Output: 13