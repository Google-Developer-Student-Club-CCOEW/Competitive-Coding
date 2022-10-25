/*

There are N people standing in a circle waiting to be executed. The counting out begins at some point in the circle and proceeds around the circle in a fixed direction. In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom.

Given the total number of persons N and a number k which indicates that k-1 persons are skipped and the kth person is killed in a circle. The task is to choose the person in the initial circle that survives.

Input: N = 5 and k = 2
Output: 3
Explanation: Firstly, the person at position 2 is killed,
then the person at position 4 is killed, then the person at position 1 is killed.
Finally, the person at position 5 is killed. So the person at position 3 survives.

*/

import java.util.*;

class Question11 {
    public static int survive(int n, int k) {
        Queue<Integer> q = new LinkedList <> ();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        while(q.size() > 1){
            int t = k;    
            for(t = k; t > 1; t--){
                int first = q.peek();
                q.remove();
                q.add(first);
                // add and remove the persons to check who survives
            }
            q.remove();
        }
        //peek gives first in the queue
        return q.peek(); // giving the top of the queuq to get our person who survive
    }
    /*
    As the people are standing in circular way and the process is
    going repeatdly so acc to q we select Queue 
     */
    public static void main (String [] args) {
        int N, K;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();
        System.out.println(survive(N, K));
    }
}
