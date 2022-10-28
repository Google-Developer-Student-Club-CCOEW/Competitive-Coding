# Queue 

Queue is a non-primitive linear data structure that permits insertion of an element at
one end and deletion of an element at the other end. The end at which the deletion of an
element take place is called front, and the end at which insertion of a new element can
take place is called rear. The deletion or insertion of elements can take place only at the
front and rear end of the list respectively.
The first element that gets added into the queue is the first one to get removed from
the list. Hence, Queue is also referred to as First-In-First-Out (FIFO) list. The name
‘Queue’ comes from the everyday use of the term.

![image](https://media.geeksforgeeks.org/wp-content/uploads/geek-queue-1.png)

 ## Queues can be implemented in two ways :

1. Static implementation (using arrays) :

In this case, the beginning of the array will be front for the
queue and the last location of the array will act as rear end.
![image](https://media.geeksforgeeks.org/wp-content/uploads/20220816162225/Queue.png)

2. Dynamic implementation (using Linked list):

In this case , the head node will act as front end of the queue and last node will act as rear end.

![image](https://www.log2base2.com/images/ds/queue-using-list-3.png)

## Operations on Queue  
A queue is an object (an abstract data structure - ADT) that allows the following operations:

Enqueue: Add an element to the end of the queue

Dequeue: Remove an element from the front of the queue

IsEmpty: Check if the queue is empty

IsFull: Check if the queue is full

Peek: Get the value of the front of the queue without removing it

## Working of Queue
Queue operations work as follows:

-two pointers FRONT and REAR

-FRONT track the first element of the queue

-REAR track the last element of the queue

-initially, set value of FRONT and REAR to -1

## Enqueue Operation
-check if the queue is full

-for the first element, set the value of FRONT to 0

-increase the REAR index by 1

-add the new element in the position pointed to by REAR

## Dequeue Operation
-check if the queue is empty

-return the value pointed by FRONT

-increase the FRONT index by 1

-for the last element, reset the values of FRONT and REAR to -1

![gif](https://logicmojo.com/assets/dist/new_pages/images/queue_op.gif)
## Queue implementation in Java

Following code implements queue using array :

```bash
 // Queue implementation in Java

public class Queue {
  int SIZE = 5;
  int items[] = new int[SIZE];
  int front, rear;

  Queue() {
    front = -1;
    rear = -1;
  }

  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1)
        front = 0;
      rear++;
      items[rear] = element;
      System.out.println("Inserted " + element);
    }
  }

  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    } else {
      element = items[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      } /* Q has only one element, so we reset the queue after deleting it. */
      else {
        front++;
      }
      System.out.println("Deleted -> " + element);
      return (element);
    }
  }

  void display() {
    /* Function to display elements of Queue */
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("\nFront index-> " + front);
      System.out.println("Items -> ");
      for (i = front; i <= rear; i++)
        System.out.print(items[i] + "  ");

      System.out.println("\nRear index-> " + rear);
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();

    // deQueue is not possible on empty queue
    q.deQueue();

    // enQueue 5 elements
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    q.enQueue(5);

    // 6th element can't be added to because the queue is full
    q.enQueue(6);

    q.display();

    // deQueue removes element entered first i.e. 1
    q.deQueue();

    // Now we have just 4 elements
    q.display();

  }
}
```
Output:
```bash
Queue is empty
Inserted 1
Inserted 2
Inserted 3
Inserted 4
Inserted 5
Queue is full

Front index-> 0
Items -> 
1  2  3  4  5  
Rear index-> 4
Deleted -> 1

Front index-> 1
Items -> 
2  3  4  5  
Rear index-> 4
```
## Circular queue 
The queue that we implemented using an array suffers from a limitation that there is a possibility that the queue is reported as full (since rear has reached the end of the array), even though in actuality there might be empty slots at the beginning of the queue. To overcome this limitation we can implement the queue as a circular queue. Here as we go on adding elements to the queue and reach the end of the array, the next element is stored in the first slot the array (provided it is free). 


![image](https://static.javatpoint.com/ds/images/circular-queue.png)

## Priority Queue  
A priority queue is a collection of elements where the elements are stored according to
their priority levels. The order in which the elements get added or removed is decided by the
priority of the element.
Following rules are applied to maintain a priority queue :
(1) The element with a higher priority is processed before any element of lower priority.
(2) If there are elements with the same priority, then the element added first in the queue
would get processed.

Priority queues are used for implementing job scheduling by the operating system where
jobs with higher priorities are to be processed first. Another application of Priority queues is
simulation systems where priority corresponds to event times.

![image](https://www.happycoders.eu/wp-content/uploads/2022/05/priority-queue-data-structure.v2-600x326.png)

## Deque (Double Ended Queue)
In a double-ended queue, insertion and deletion can take place at both the front and rear ends of the queue.

![image](https://www.java2novice.com/images/dequeue.png)

## Complexity analysis

![image](https://devopedia.org/images/article/406/7191.1647175386.jpg)

## Applications of Queue
-Managing requests on a single shared resource such as CPU scheduling and disk scheduling

-Handling hardware or real-time systems interrupts

-Handling website traffic

-Routers and switches in networking

-Maintaining the playlist in media players

-Call Center phone systems use Queues to hold people calling them in order
