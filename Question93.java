import java.io.*;
import java.util.*;
public class Solution{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 1;
    for(int i=0;i<s.length();i++)
    {
      char c = s.charAt(i);
      if(c>='A' && c<='Z')
      {
        count++;
      }
    }
      System.out.println(count);
    
  }
}
