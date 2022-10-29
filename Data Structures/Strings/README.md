
# STRINGS

Strings are defined as an array of characters. 
Some examples of string- String s= ”cummins”

 

## HOW DOES A STRING WORK?

In programming, a String is used as a datatype just like int or float might be used; however, the difference here is that, String deals with textual kind of data. It can consist of alphabets, numbers, spaces and special characters. Strings are often enclosed in double quotation marks. In java string is treated not as a data type but as an object.

 

## HOW TO CREATE A STRING?

IN JAVA There are two ways to create String object:
	By string literal
	By new keyword
### 1)BY STRING LITERAL

Java String literal is created by using double quotes. For Example:
String s="welcome";  
String literal is the more memory efficient way as it checks the memory pool and doesn’t assign a new memory if the string already exists.
For eg- String w= “ welcome”;
A new instance will not be created here as “welcome” already exists. Instead both s and w will point to the memory location where its stored.
 
### 2) BY NEW KEYWORD

String s=new String("Welcome");
This will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in a heap (non-pool).

## TIME COMPLEXITY AND SPACE COMPLEXITY

A string is a data structure in computer science used to store the sequence of characters. Each character in the string consists of a specific index. Below is its time and space complexity.
 
### Time Complexity of String containing ‘N’ characters:

•	Reading or editing any character stored at a particular index takes O(1) time, as similar to arrays, its relative index can also be calculated in constant time.
•	Inserting and deleting any character at a particular index in strings takes O(N) time, as we need to skip all the characters at previous indices.
•	Searching any character in strings takes O(N) time, as we check for every character present in the string.

### Space Complexity in Strings:

As we do not need any extra space to perform all the operations mentioned above, the space complexity of reading, editing, inserting, or deleting is constant i.e., O(1). Only the space taken to create the string is the auxiliary space.
 

## FUNCTIONS IN STRING

String in java comes with some inbuilt functions to help the user.
Some of the most common functions are- length(), charAt(), concat() etc




### CODE SNIPPET OF SOME STRING OPERATIONS



		public static void main(String[] args) 
		{
			String str1;
			String str2;
			int opt;
			Scanner so= new Scanner(System.in);
			System.out.println("enter the first string-");
			str1=so.next();
			System.out.println("enter the second string-");
			str2=so.next();
			int x=str1.length();
			int y=str2.length();
			StringBuilder sc= new StringBuilder();
			int ch;
			do 
			{
			System.out.println("MENU-\n 1)show length of first string\n2)show length of second string\n3)combinine the strings");
			System.out.println("4)reverse first string\n5)reverse second string\n6)convert strings to lower case");
			System.out.println("7)convert strings to upper case\n8)to replace one character with another in string 1");
			System.out.println("9)to replace one character with another in string 2\n10)to get a substring from string 1");
			System.out.println("11)to get substring from string 2");
			System.out.println("enter your choice-");
			ch=so.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("the length of string 1 is-"+x);
				break;
				
			case 2:
				System.out.println("the length of string 2 is-"+y);
				break;
				
			case 3:
				System.out.println("the combination of strings is-"+str1+" "+str2);
				break;
				
			case 4:
				sc.append(str1);
				sc=sc.reverse();
				System.out.println("the reverse of string 1 is-"+sc);
				break;
				
			case 5:
				sc.append(str2);
				sc=sc.reverse();
				System.out.println("the reverse of string 2 is-"+sc);
				break;
				
			case 6:
				System.out.println("the first string in lower case is-"+str1.toLowerCase());
				System.out.println("the second string in lower case is-"+str2.toLowerCase());
				break;
				
			case 7:
				System.out.println("the first string in upper case is-"+str1.toUpperCase());
				System.out.println("the second string in upper case is-"+str2.toUpperCase());
				break;
				
			case 8:
				char a1,a2;
				System.out.println("enter character you wish to replace-");
				a1=so.next().charAt(0);
				System.out.println("enter the charter you want in its place-");
				a2=so.next().charAt(0);
				System.out.println("the new string is-"+str1.replace(a1, a2));
				break;
				
			case 9:
				char a3,a4;
				System.out.println("enter character you wish to replace-");
				a3=so.next().charAt(0);
				System.out.println("enter the charter you want in its place-");
				a4=so.next().charAt(0);
				System.out.println("the new string is-"+str2.replace(a3, a4));
				break;
				
			case 10:
				int n1,n2;
				System.out.println("enter the position of the character from which you want substring to start");
				n1=so.nextInt();
				System.out.println("enter number at which you want substring to end");
				n2=so.nextInt();
				System.out.println("the substring is-"+str1.substring(n1-1,n2));
				break;
				
			case 11:
				int n3,n4;
			    System.out.println("enter the position of the character from which you want substring to start");
			    n3=so.nextInt();
			    System.out.println("enter number at which you want substring to end");
			    n4=so.nextInt();
			    System.out.println("the substring is-"+str2.substring(n3-1,n4));
			    break;
				
			default:
				System.out.println("enter proper choice");
				break;
				
			}
			System.out.println("do you want to continue?\nenter 1 to continue and 0 to stop");
			opt=so.nextInt();
			}while(opt==1);
			so.close();

		}





