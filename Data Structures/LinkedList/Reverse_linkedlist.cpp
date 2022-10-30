#include<iostream>
#include<cstdlib>
using namespace std;
struct Node{
	int data;
	struct Node* link;
};
void display(struct Node*head){
	struct Node* p = head;
	while(p!=NULL){
		cout<<p->data<<endl;
		p = p->link;
	}
}
struct Node* reverse(struct Node*head){
	struct Node* prev = NULL;
	struct Node* next = NULL;
	while(head!=NULL){
		next = head->link;
		head->link = prev;
		prev = head;
		head = next;
	}
	head = prev;
	return head;
}
int main(){
	struct Node* head;
	struct Node* first;
	struct Node* second;
	struct Node* third;
	head = new struct Node;
	first = new struct Node;
	second = new struct Node;
	third = new struct Node;
	head -> data = 1;
	head -> link = first;
	first -> data = 2;
	first -> link = second;
	second -> data = 3;
	second -> link = third;
	third -> data = 4;
	third -> link = NULL;
	cout<<"Original linked list:"<<endl;
	display(head);
	cout<<"Reverse linked list:"<<endl;
	head = reverse(head);
	display(head);
}
