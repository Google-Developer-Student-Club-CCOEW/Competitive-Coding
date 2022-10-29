import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question_82 {
	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int no_birds = in.nextInt();		//input no. of birds
      int[] birds = new int[5];
      for (int i = 0; i < no_birds; i++) {
    	  birds[in.nextInt()-1]++;			//array of birds sighting
      }
      int max = 0;
      int location = 0;
      for (int i = 0; i < 5; i++) {
          if (birds[i] > max) {
              max = birds[i];		//max sighed bird
              location = i+1;
          }
      }
      System.out.println(location);
  }
}
