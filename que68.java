package add;
import java.util.*;

class Add{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
String str = sc.next();
char a[] = str.toCharArray();
int count=0;
for(int i=0;i<str.length();i++) {
	if(a[i]=='*') {
		count++;
	}
}
if(count >= k) {
	System.out.println("YES");}
else
 System.out.println("NO");
}
}
