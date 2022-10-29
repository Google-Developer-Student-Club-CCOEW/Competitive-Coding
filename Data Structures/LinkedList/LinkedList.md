# Linked List
A linked list is a linear data structure that includes a series of connected nodes. Here, each node stores the data and the address of the next node.It has Dynamic Memory Allocation.

<img width="500" alt="Capture" src="https://www.alphacodingskills.com/imgfiles/linked-list.PNG">

<h2>Types of Linked List:</h2>
<p>There are four key types of linked lists:

1.Singly linked lists

2.Doubly linked lists

3.Circular linked lists

4.Circular doubly linked lists
</p>
<img width="500" alt="Capture" src="https://www.simplilearn.com/ice9/free_resources_article_thumb/Types-of-Linked-List/types_of_linked_list-what-img2.PNG">

<h2>How Linked List Works</h2>
<p>A linked list in Java is a dynamic data structure whose size increases as you add the elements and decreases as you remove the elements from the list.
 The elements in the linked list are stored in containers.
The list holds the link to the first container.
All the containers have a link to the next container in the list.
 Whenever you add an element to the list using add() operation, a new container is created, and this container is linked to the other containers in the list.</p>

<h2>Singular Linked List</h2>

<p>
The type of linked list consisting of a sequence of nodes where each node consists of data and a link to the next node, that can be traversed from the first node of the list (also called as head) to the last node of the list (also called as Tail)  and is unidirectional is called Singly Linked list.

The above figure demonstrates a singly linked list.

Each element in the list is called a node.

A node is made of two parts, namely data and pointer.

Data is the data stored in the   and the pointer is the next node in the list.

The first node in the list is referred to as the head of the list.

The last node in the list is the tail, and it points to NULL.

<h2><strong>Insertion of node</strong></h2>
<pre>
1.Insert at the beginning
2.Allocate memory for new node
3.Store data
4.Change next of new node to point to head
5.Change head to point to recently created node

<img width="500" alt="Capture" src="https://www.codesdope.com/staticroot/images/ds/link19.gif">

</pre>
<img width="500" alt="Capture" src="https://static.javatpoint.com/ds/images/insertion-in-singly-linked-list-at-beginning.png">

<h2><strong>Deletion of node</strong></h2>
<pre>
1. If the head node has the given key, make the head node points to the second node and free its memory.

2.Otherwise,From the current node, check whether the next node has the given key if yes, make the current->next = current->next->next and free the memory.
</pre>

<img width="500" alt="Capture" src="https://static.javatpoint.com/ds/images/deletion-in-singly-linked-list-at-beginning.png">

<img width="500" alt="Capture" src="https://media.geeksforgeeks.org/wp-content/uploads/20200318172830/ezgif.com-gif-maker2.gif">

</p>
<p><strong>Implementation of Singly Linked List in banking</strong></p>
<pre>import java.util.*;
import java.io.*;

class node{
    int acc_no;
    String name;
    String address;
    Double balance;
    node next;
}
class bank{
    Scanner sc = new Scanner(System.in);
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ir);
    node head;
    bank(){
        head=null;
    }
    void create() throws IOException {
        int a;
        String b,c;
        Double d;
        node ptr;
        System.out.println("Enter the new Account Number to be Inserted:");
        a= sc.nextInt();
        System.out.println("Enter the new Name to be Inserted:");
        b= br.readLine();
        System.out.println("Enter the new Address to be Inserted:");
        c=br.readLine();
        System.out.println("Enter the new Balance to be Inserted:");
        d=sc.nextDouble();
        ptr=new node();
        ptr.acc_no=a;
        ptr.name=b;
        ptr.address=c;
        ptr.balance=d;
        ptr.next=null;
        if (head==null){
            head=ptr;
            System.out.println("\n\tCreated first Node");
        }
        else{
            ptr.next=head;
            head=ptr;
            System.out.println("\n\tInserted");
        }
    }
    void insert() throws IOException {
        int e;
        String f,g;
        Double h;
        node prev,ptr,cur;
        System.out.println("Enter the new Account Number to be Inserted:");
        e= sc.nextInt();
        System.out.println("Enter the new Name to be Inserted:");
        f= br.readLine();
        System.out.println("Enter the new Address to be Inserted:");
        g=br.readLine();
        System.out.println("Enter the new Balance to be Inserted:");
        h=sc.nextDouble();
        ptr=new node();
        ptr.acc_no=e;
        ptr.name=f;
        ptr.address=g;
        ptr.balance=h;
        ptr.next=null;
        prev=null;
        cur=head;
        while (cur!=null && cur.acc_no<e){
            prev=cur;
            cur=cur.next;
        }
        if (cur!=null && cur.acc_no==e){
            System.out.println("\n\tNo Duplication of elements");
        }
        else {
            /*Insertion is possible*/
            ptr=new node();
            ptr.acc_no=e;
            ptr.name=f;
            ptr.address=g;
            ptr.balance=h;
            ptr.next=null;
            /*now insertion*/
            if (prev==null){
// insertion at head
                ptr.next=head;
                head=ptr;
                System.out.println("\n\tInserted at head");
            }
            else if (prev!=null && cur==null) {
//              Insertion at the End
                prev.next=ptr;
                System.out.println("\n\tInserted at the end");
            }
            else{
//                Insertion in between
                prev.next=ptr;
                ptr.next=cur;
                System.out.println("\n\tInserted in Between");
            }
        }
    }
    void delete(){
        node prev,cur;
        if (head==null){
            System.out.println("List is empty!");
        }
        else {
            System.out.println("Enter the account number you want to delete: ");
            int v=sc.nextInt();
            prev=null;
            cur=head;
            while (cur!=null && cur.acc_no<v){
                prev=cur;
                cur=cur.next;
            }
            if (cur==null ||(cur!=null && cur.acc_no!=v)){
                System.out.println("No such Account Number Exist!");
            }
            else{
                /*cur is node to be deleted*/
                if(prev==null){
                    head=cur.next;
                    cur.next=null;
                    cur=null;
                    System.out.println("Account number Deleted");
                }
                else {
                    prev.next=cur.next;
                    cur.next=null;
                    cur=null;
                    System.out.println("Account number Deleted");
                }
            }
        }
    }
    void display(){
        node cur;
        if (head==null){
            System.out.println("\n\tList is Empty");
        }
        else {
            cur=head;
            while(cur!=null){
                System.out.println("\n\tAccount Number: "+cur.acc_no+"\n\tName of the Customer:"+cur.name+"\n\tAddress of the Customer"+cur.address+"\n\tBalance amount of the account"+cur.balance);
                cur=cur.next;
            }
        }
    }
    void deposit(){
        node cur;
        int acc_tosearch;
        Double amount_todeposit;
        System.out.println("Enter the Account Number you want to Deposit:");
        acc_tosearch= sc.nextInt();
        System.out.println("Enter the amount to be deposited:");
        amount_todeposit= sc.nextDouble();
        int flag=0;
        cur=head;
        while (cur!=null) {
            if (cur.acc_no == acc_tosearch) {
                flag = 1;
                break;
            }
                cur = cur.next;
            }
        cur.balance= (cur.balance+amount_todeposit);
            if (flag==1) {
                    System.out.println("Account Number Found and amount deposited\n\t" + "Available Balance:"+cur.balance);
                }
            else{
                System.out.println("Account Number not found");
            }
        }
    void withdraw(){
        node cur;
        int acc_tosearch;
        Double amount_towithdraw;
        System.out.println("Enter the Account Number you want to withdraw:");
        acc_tosearch= sc.nextInt();
        System.out.println("Enter the amount to be Withdrawn:");
        amount_towithdraw= sc.nextDouble();
        int flag=0;
        cur=head;
        while (cur!=null) {
            if (cur.acc_no == acc_tosearch) {
                flag = 1;
                break;
            }
            cur = cur.next;
        }
        if (cur.balance>1000) {
            cur.balance = (cur.balance - amount_towithdraw);
            if (flag == 1) {
                System.out.println("Account Number Found and amount withdrawn\n\t" + "Available Balance:" + cur.balance);
            }
            else{
                    System.out.println("Account Number not found");
                }
            }
        else {
            System.out.println("Amount Not Sufficient to be Withdrawn!");
        }
    }
public static void main(String args[]) throws IOException {
        Scanner sc1=new Scanner(System.in);
        bank b1=new bank();
        int ch;
        do {
            System.out.println("********WELCOME TO MAHARASHTRA BANK*********");
            System.out.println("\n\t1]Create first node\n\t2]Insertion of Account Number:\n\t3]Deletion of Account Number\n\t4]Deposit Amount\n\t5]Withdraw Amount\n\t6]Display the Linked List\n\t7]Exit");
            System.out.println("\nEnter your Choice:");
            ch=sc1.nextInt();
            switch (ch){
                case 1:
                    b1.create();
                    break;
                case 2:
                    b1.insert();
                    break;
                case 3:
                    b1.delete();
                    break;
                case 4:
                    b1.deposit();
                    break;
                case 5:
                    b1.withdraw();
                    break;
                case 6:
                    b1.display();
                    break;
                case 7:
                    System.out.println("********Thank you! visit again********");
                    break;
            }
        }while (ch!=7);
    }

}
</pre>

<h2><strong>Doubly Linked List:</strong></h2>
<img width="500" alt="Capture" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2014/03/DLL1.png">

A Doubly Linked List (DLL) contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in the singly linked list.
<h2>Insertion in DLL:</h2>

<img width="500" alt="Capture" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2014/03/DLL_add_front1.png">

<h2>Deletion in DLL:</h2>
<img width="500" alt="Capture" src="https://static.javatpoint.com/ds/images/deletion-in-doubly-linked-list-at-beginning.png">
<h2>Circular Singly Linked List</h2>
<img width="500" alt="Capture" src="https://static.javatpoint.com/ds/images/circular-singly-linked-list.png">

<h2>List of Functions of Linked List</h2>
<p>

list of basic linked list operations that we will cover in this article.

1.Traversal - access each element of the linked list

2.Insertion - adds a new element to the linked list

3.Deletion - removes the existing elements

4.Search - find a node in the linked list

5.Sort - sort the nodes of the linked list
(more description added in singly linked list)
</p>
<h2>Time Complexity Analysis of the operations in Linked List</h2>
<img width="400" alt="Capture" src="https://scaler-topics-articles-md.s3.us-west-2.amazonaws.com/time-complexity-of-linked-list.webp">




