import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question_83 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();							//input length of ranked arraylist
		ArrayList<Integer> ranked = new ArrayList<Integer>();
		int i =0;
		while (i < n) {									//input the ranked arraylist
			ranked.add(sc.nextInt());
			i++;
		}
																//remove duplicates from entered arraylist
		ArrayList<Integer> new_ranked = new ArrayList<Integer>();
		for( int z=0; z < n; z++) {	
			if (!new_ranked.contains(ranked.get(z))) {
	            new_ranked.add(ranked.get(z));
	        }
		}
																//input length of player arraylist
		int m = sc.nextInt();
		ArrayList<Integer> player = new ArrayList<Integer>();
		int j =0;
		while (j < m) {										//input the player arraylist
			player.add(sc.nextInt());
			j++;
		}
		
		for( int k = 0; k < m ; k++) {
			int e = player.get(k);						//each time add an element from player to ranked
			new_ranked.add(e);
			Collections.sort(new_ranked,Collections.reverseOrder());		//sort arraylist
			int index = new_ranked.indexOf(e);					//find index at which the player is ranked now and print
			System.out.println(index+1);
			new_ranked.remove(index);					//remove the score from ranked arraylist
		}
	}
}
