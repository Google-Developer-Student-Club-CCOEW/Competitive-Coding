# Stack

Stack is a linear data structure which follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out).
#
#
<img width="386" alt="Capture" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/stack.png">

#
## Queues can be implemented in two ways :

### 1.Static implementation (using arrays) :
#
<img width="386" alt="Capture" src="https://www.simplilearn.com/ice9/free_resources_article_thumb/Soni-Stack-Article/stack-implementation-using-array.png">

### 2.Dynamic implementation (using Linked list):
#

<img width="386" alt="Capture" src="https://static.javatpoint.com/ds/images/ds-linked-list-implementation-stack2.png">
##

## Operations on Stack:

<img width="386" alt="Capture" src="https://s3.ap-south-1.amazonaws.com/afteracademy-server-uploads/stack-and-its-basic-operations-operations-402bb6db2acfd56a.png">

######
1.push() to insert an element into the stack
######
2.pop() to remove an element from the stack
######
3.top() Returns the top element of the stack.
######
4.isEmpty() returns true is stack is empty else false
######
5.size() returns the size of stack

<h2>Push:</h2>
Adds an item to the stack. If the stack is full, then it is said to be an Overflow condition.

<p><strong>Algorithm for push:</strong></p>
<pre>
begin
 if stack is full
    return
 endif
else  
 increment top
 stack[top] assign value
end else
end procedure
</pre>
<h2>POP:</h2>
<p>Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.</p>
<p><strong>Algorithm for pop</strong></p>
<pre>begin
 if stack is empty
    return
 endif
else
 store value of stack[top]
 decrement top
 return value
end else
end procedure</pre>
<h2>Top:
</h2>
Returns the top element of the stack.

<p><strong>Algorithm for top</strong></p>
<pre>begin 
  return stack[top]
end procedure</pre>

<h2>isEmpty:</h2>
Returns true if the stack is empty, else false.
<p><strong>Algorithm for isEmpty</strong></p>

<pre>begin
 if top < 1
    return true
 else
    return false
end procedure</pre>

<h2><strong>Understanding stack practically:</strong></h2>
<p>There are many real-life examples of a stack. Consider the simple example of plates stacked over one another in a canteen. The plate which is at the top is the first one to be removed, i.e. the plate which has been placed at the bottommost position remains in the stack for the longest period of time. So, it can be simply seen to follow the LIFO/FILO order.</p>

<h2>Stack implementation in java</h2>
<h3>Using array</h3>
<pre>
import java.util.*;
public class Stack_array {
    Scanner sc = new Scanner(System.in);
    int top, n, v;
    int stack[];
    Stacknormal(int max) {
        top = -1;
        n=max;
        System.out.println("Enter the number of elements:");
        stack = new int[n];
    }
     boolean isEmpty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }
    boolean isfull() {
        if (top == n - 1) ;
        {
         System.out.println("Stack is Full");
        }
        return false;
    }
    void push() {
        if(top==n-1){
            System.out.println("Stack is full");
        }
        else {
            System.out.println("Enter the Value:");
            v = sc.nextInt();
            stack[++top] = v;
            System.out.println("Element Pushed");
        }
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(stack[top]);
        }
    }
    void pop() {
        if (isEmpty()==true) {
        }
        else {
            v = stack[top--];
            System.out.println("Deleted");
        }
    }
    void show() {
        if (isEmpty()==true) {
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println("" + stack[i]);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number of elements in the stack:");
        int n = sc1.nextInt();
        int choice;
        Stacknormal s1=new Stacknormal(n);
        do {
            System.out.println("\n\t1]Check if Stack is empty\n\t2]Check if Stack is full\n\t3]Push the elment\n\t4]Pop the element\n\t5]Display the stack\n\t6]Peek the Stack\n\t7]exit ");
            System.out.println("\n\tEnter your choice:");
            choice = sc1.nextInt();
            switch (choice) {
                case 1:s1.isEmpty();
                    break;
                case 2:s1.isfull();
                    break;
                case 3:s1.push();
                    break;
                case 4:s1.pop();
                    break;
                case 5:s1.show();
                    break;
                case 6:s1.peek();
                    break;
                case 7:System.out.println("Thank you");
                    break;
                default:System.out.println("Enter Valid choice");
            }
        }
        while (choice != 7);
    }
}
</pre>
<h3>Using Linked list</h3>
<pre>
    import java.util.*;
    class node{
    int data;
    node next;
    }
    class stacklink {
		Scanner sc=new Scanner(System.in);
    node head;
    stacklink(){
        head=null;
    }
    void push(){
        node ptr;
        int v;
        v=sc.nextInt();
        ptr=new node();
        ptr.data=v;
        ptr.next=null;
        if (head==null){
            head=ptr;
            System.out.println("this is first element inserted in the stack");
        }
        else{
            ptr.next=head;
            head=ptr;
            System.out.println("inserted");
        }
    }
    void pop(){
        node cur;
        if(head==null){
            System.out.println("Stack is empty");
        }
        else{
          cur=head;
          head=cur.next;
          cur=null;
          System.out.println("Deleted");
        }
    }
    void show(){
        node cur;
        if(head==null){
            System.out.println("Stack is empty");
        }
        else{
            cur=head;
            while (cur!=null){
                System.out.println(""+cur.data);
                cur=cur.next;
            }
        }
    }
    void peek(){
        if (head==null){
            System.out.println("Stack is empty");
        }
        else{
            node cur;
            cur=head;
            System.out.println(""+cur.data);
        }
    }
    public static void main(String args[]) {
        Scanner sc1=new Scanner(System.in);
        stacklink s1=new stacklink();
        int choice;
        do {
            System.out.println("\n\t1]Push\n\t2]pop\n\t3]display\n\t4]peek\n\t5]exit");
            System.out.println("\n\tEnter your choice:");
            choice=sc1.nextInt();
            switch(choice){
                case 1:s1.push();
                break;
                case 2:s1.pop();
                break;
                case 3:s1.show();
                break;
                case 4:s1.peek();
                break;
                case 5:System.out.println("Exit");
                break;
                default:System.out.println("Invalid Choice");
            }
        }
        while (choice!=5);
    }


}
</pre>


<h2>Complexity Analysis</h2>
<img width="500" alt="Capture" src="https://miro.medium.com/max/786/1*cn3oD0etXemvOEdCGxoMpQ.png">
<h2>Applications of the stack:</h2>
<p>Infix to Postfix /Prefix conversion</p>
<p>Redo-undo features at many places like editors, photoshop.</p>
<p>Forward and backward features in web browsers</p>

