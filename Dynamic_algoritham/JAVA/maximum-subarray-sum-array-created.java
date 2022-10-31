// Java program to print largest contiguous
// array sum when array is created after
// concatenating a small array k times.
import java.io.*;

class GFG {
	
// Returns sum of maximum sum
// subarray created after
// concatenating a[0..n-1] k times.
static int maxSubArraySumRepeated(int a[],
							int n, int k)
{
	int max_so_far = 0;
	int INT_MIN, max_ending_here=0;

	for (int i = 0; i < n*k; i++)
	{
		// This is where it differs from
		// Kadane's algorithm. We use modular
		// arithmetic to find next element.
		max_ending_here = max_ending_here +
									a[i % n];

		if (max_so_far < max_ending_here)
			max_so_far = max_ending_here;

		if (max_ending_here < 0)
			max_ending_here = 0;
	}
	return max_so_far;
}

// Driver program to test maxSubArraySum
public static void main (String[] args) {
	
	int a[] = {10, 20, -30, -1};
	int n = a.length;
	int k = 3;
	
	System.out.println("Maximum contiguous sum is "
				+ maxSubArraySumRepeated(a, n, k));
}

}
	

