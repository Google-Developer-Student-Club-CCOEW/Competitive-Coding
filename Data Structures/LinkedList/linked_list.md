A linked list is a Linear Data Structure that consists nodes linked together. Each node have their own Data field 
and a reference (link/address) to the next node in the list.

The logical/mathematical model of a particular organisation or data is called the DATA STRUCTURE.

Linked list can be visualized as a chain of nodes, where every node points to the next node. The beginning node is termed as Start. 
Remember every Linked List has its ending Node's next part as NULL(i.e. Last node carries a address as NULL to mark the end of the list.)

In this document, I am going to discuss only about the Single Linked List!
I have a detailed code on how to Create a SINGLE linked list and Display it: 
Follow it accordingly:

#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>  //we take this header file since we are going to dynamically allocate the memory
struct node
{
    int data;
    struct node *next;
};

struct node *start=NULL;
struct node *create(struct node *);
struct node *display(struct node *);

int main()
{
 int c,i;
 printf("Press 1 to create list: ");
 printf("Press 2 to display: ");
 printf("Press 3 to exit: ");
 printf("Enter your choice: ");
 scanf("%d", &c);

 switch(c)
 {
     case 1: create();
             break;
     case 2: display();
             break;
     case 3: exit(0);
 }
}

struct node *create(struct node *)
{
    struct node *new_node, *ptr;
    int num;
    printf("\n Enter -1 to end, else enter your data: ");
    scanf("%d", &num);
    while(num!=-1)
    {
      new_node=(struct node*)malloc(sizeof(struct node)); // dynamic memory allocation is done here
      new_node -> data=num;
      if(start==NULL)
       {
        new_node -> next=NULL;
        start = new_node;
       }
    else
       {
           ptr=start;
           while(ptr->next != NUll)
           {
             ptr=ptr->next;
           }
             ptr->next=new_node;
             new_node->next=NUll;

       }
       printf("\n Enter the data : ");
       scanf("%d", &num);
    }
    return start;
}

struct node *display(struct node *start)  // also termed as traversal or going through every node in a linked list
{
    struct node *ptr;
    ptr=start;
    while(ptr!=NULL)
    {
        printf("\t %d", ptr -> data):
        ptr=ptr -> next;
    }
    return start;
}
// end of the program

Now, there are multiple functions of a Linked List.. Like insertion, deletion and Search.
Their Time Complexity are as follows:-

Time Complexity	  Worst Case	  Average Case
Search	          O(n)	        O(n)
Insert	          O(1)	        O(1)
Deletion	        O(1)	        O(1)
