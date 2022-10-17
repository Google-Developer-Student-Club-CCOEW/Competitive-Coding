
import java.util.Scanner;

public class Main {
        
    // Function to check the Vowel
    static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                           ch=='O' || ch=='U');
    }
      
    // Returns count of vowels in str
    static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) // Check for vowel
                ++count;
        return count;
    }
      
  
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        String str=sc.next();
        
      
        // Total numbers of Vowel
        if(countVowels(str)==5){
            System.out.println("WINNER");
        }else{
            System.out.println("LOSER");
        }
        sc.close();
    }
}
