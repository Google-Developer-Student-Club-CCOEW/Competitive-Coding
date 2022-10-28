import java.util.*;
import java.lang.*;
import java.io.*;
class String
{
  public static void main(String args[]) throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-->0){
    String str = br.readLine();
    String substr = br.readLine();
      int[] a = new int[30];
      int flag=0;
      StringBuilder sb = new StringBuilder();
      for(char c:str.toCharArray()){
        a[c-97]++;
      }
      for(char c:substr.toCharArray()){
        a[c-97]--;
      }
      for(int i=0;i<substr.length()-1;i++){
        if(substr.charAt(0)!=substr.charAt(i+1)){
          if(substr.charAt(0)!=substr.charAt(i+1)){
            flag=1;
          }
          break;
        }
      }
      for(int i=0;i<26;i++){
        if((char)(i+97)!=substr.charAt(0)){
          while(a[i]>0){
            sb.append((char)(i+97));
            a[i]--;
          }
        }
        else{
          if(flag ==0){
            while(a[i]>0){
               sb.append((char)(i+97));
            a[i]--;
          }
            sb.append(substr);
        }
          else{
            sb.append(substr);
            while(a[i]>0){
               sb.append((char)(i+97));
            a[i]--;
          }
         }
        }
      }
      System.out.println(sb.toString());
    }
  }
}
