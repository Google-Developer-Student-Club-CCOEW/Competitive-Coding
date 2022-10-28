//Question 75
package hello;
import java.util.*;

class A{

	
	static int subCount(int arr[], int n, int k)
	{

				int mod[] = new int[k];
		Arrays.fill(mod, 0);

		
		int cumSum = 0;
		for (int i = 0; i < n; i++) {
			cumSum += arr[i];

			// as the sum can be negative, taking modulo twice
			mod[((cumSum % k) + k) % k]++;
		}

		// Initialize result
		int result = 0;

		// Traverse mod[]
		for (int i = 0; i < k; i++)

			// If there are more than one prefix subarrays
			// with a particular mod value.
			if (mod[i] > 1)
				result += (mod[i] * (mod[i] - 1)) / 2;

		// add the elements which are divisible by k itself
		// i.e., the elements whose sum = 0
		result += mod[0];

		return result;
	}

	//MAIN
	public static void main(String[] args)
	{

		int arr[] = {9,3,1,2,6,3};
		int k = 3;
		int n = arr.length;
		System.out.println(subCount(arr, n, k));
		
	}
}


