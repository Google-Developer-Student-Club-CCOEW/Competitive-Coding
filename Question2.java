
public class Question2 {
	//trie datastructure is used here
	static class Node{
        char ch;
        Node[] kids;
        int cnt = 0;	//to keep track of how many words are going down the same path in Trie
        Node(char ch){
            this.ch = ch;
            this.kids = new Node[26];
        }
    }
    
    public static int[] sumPrefix(String[] words) {
        Node root = new Node('~');
        for(String s : words){ //creating the trie 
            insertInTrie(s, root);
        }
        
        int[] ans = new int[words.length];
        for(int i = 0; i < words.length; ++i){
            ans[i] = getScore(root, words[i]);  //calling the getScore function
        }
        
        return ans;	//prefix score for each string is returned
    }
    
    //calculating the prefix score for each string
    private static int getScore(Node root, String s){
        Node temp = root;
        int sum = 0;
        for(int i = 0; i < s.length(); ++i){
            temp = temp.kids[s.charAt(i) - 'a'];
            sum += temp.cnt;  //summing the occurence
        }
        return sum;
    }
    
    private static void insertInTrie(String s, Node root){ //creating the trie
        Node temp = root;
        for(int i = 0; i < s.length(); ++i){ //trversing till the string length
            if(temp.kids[s.charAt(i) - 'a'] == null){ //if temp is empty
                temp.kids[s.charAt(i) - 'a'] = new Node(s.charAt(i)); //adding the charater at root node
            }
            temp = temp.kids[s.charAt(i) - 'a'];
            temp.cnt++; //incrementing the count of character
        }
    }
	public static void main(String[] args) {
		String [] arr= {"abcd","ab","bc","b"};
		int[] res=sumPrefix(arr); //calling the function
		System.out.print("["+res[0]);
		for(int i=1;i<res.length;i++)
		{
			System.out.print(","+res[i]);
		}
		System.out.print("]");
	}

}

/*
 
input:
["abc","ab","bc","b"]
output:
[5,4,3,2]


input:
["abcd"]
output:
[4]
*/