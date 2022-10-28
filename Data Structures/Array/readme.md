
# Array Data Structure

An array is a linear data structure that collects elements of the same data type and stores them in contiguous and adjacent memory locations. Arrays work on an index system starting from 0 to (n-1), where n is the size of the array.


## Need for array
The idea is to store multiple items of the same type together. This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array (generally denoted by the name of the array).




![App Screenshot](https://media.geeksforgeeks.org/wp-content/uploads/array-2.png)


## Types of array
There are majorly two types of arrays, they are:

**I] One-Dimensional Arrays:**
You can imagine a 1d array as a row, where elements are stored one after another.
![image](https://www.simplilearn.com/ice9/free_resources_article_thumb/Vaibhav-Arrays%20Article/Arrays_in_ds-array-type-1d-img1.PNG)

**II] Multidimensional Arrays:**

**Two-Dimensional Array:**
Two – dimensional array is the simplest form of a multidimensional array. We can see a two – dimensional array as an array of one-dimensional array for easier understanding. 

The basic form of declaring a two-dimensional array of size x, y: 

**Syntax:**  
data_type array_name[x][y];

![image](https://media.geeksforgeeks.org/wp-content/uploads/two-d.png)

**Three-Dimensional Arrays:** 
You can imagine it like a cuboid made up of smaller cuboids where each cuboid can contain an element.

The basic form of declaring a three-dimensional array of size x, y, z: 

**Syntax:**  data_type array_name[x][y][z];
![image](https://media.geeksforgeeks.org/wp-content/uploads/3D-array.jpg)
## How array works
-Memory is allocated immediately after the array is created and it’s empty until you assign the values.

![App Screenshot](https://soshace.com/wp-content/uploads/2019/10/Python-Array-Explained-and-Visualized-how-arrays-work.png)

-Their elements are located in contiguous locations in memory, so they can be accessed very efficiently (random access, O(1) = constant time) using indices.

-Indices start at 0, not 1 like we are used to.

-Inserting elements at the beginning or in the middle of the array involves moving elements to the right. If the array is full, creating a new, larger array (which is not very efficient). Inserting at the end of the array is very efficient, constant time O(1).

-Removing elements from the beginning or from the middle of the array involves moving all the elements to the left to avoid leaving an empty space in memory. This guarantees that the elements are stored in contiguous spaces in memory. Removing at the end of the array is very efficient because you only delete the last element.

-To find an element, you need to check the entire array until you find it. If the data is sorted, you can use algorithms such as Binary Search to optimize the process.



![gif](https://miro.medium.com/max/1200/1*EYkSkQaoduFBhpCVx7nyEA.gif)

## How to create array
**Declaring an array in Java**
```bash
  // both are valid declarations
int intArray[]; 
or int[] intArray; 

byte byteArray[];
short shortsArray[];
boolean booleanArray[];
long longArray[];
float floatArray[];
double doubleArray[];
char charArray[];

// an array of references to objects of
// the class MyClass (a class created by
// user)
MyClass myClassArray[]; 

Object[]  ao,        // array of Object
Collection[] ca;  // array of Collection

```
**Instantiating an Array in Java**

When an array is declared, only a reference of an array is created. To create or give memory to the array, you create an array like this: 
```bash
  var-name = new type [size];
```
**Array Literal**

In a situation where the size of the array and variables of the array are already known, array literals can be used. 
```bash
  int[] intArray = { 1,2,3,4,5,6,7,8,9,10 }; 
 // Declaring array literal
```
The length of this array determines the length of the created array.
## Code snippet
```bash
  // Java program to illustrate creating an array
// of integers, puts some values in the array,
// and prints each value to standard output.

class ArrayDemo {
	public static void main(String[] args)
	{
		// declares an Array of integers.
		int[] arr;

		// allocating memory for 5 integers.
		arr = new int[5];

		// initialize the first elements of the array
		arr[0] = 10;

		// initialize the second elements of the array
		arr[1] = 20;

		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at index " + i + " : " + arr[i]);
	}
}

```
Output
```bash
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
```
```bash
Time Complexity: O(n)
Auxiliary Space: O(1)
```
## Time Complexity Analysis of Array
Fetching an element at a specific memory address takes O(√N) time where N is the block of memory being read.

Once the block of memory is in RAM (Random Access Memory) accessing a specific element takes constant time because we can calculate its relative address in constant time.

Bringing the block of memory from external device to RAM takes O(√N) time. As array elements are contiguous in memory, this operation takes place only once. Hence, it is reasonable to assume the time complexity to access an element to be O(1).

Over-writing an element at a specific index takes constant time O(1) because we need to access the specific index at the relative address and add new element. This is same as accessing an element.

Note: Even in this operation, we need to load the array from external device that consumes O(√N) time.

Inserting and deleting elements take linear time depending on the implementation. If we want to insert an element at a specific index, we need to skip all elements from that index to the right by one position. This takes linear time O(N).

If we want to insert element at end of array, we can do it in constant time as we can keep track of length of array as a member attribute of array. This approach is taken by standard array implementation in Java.

Similar is the approach with delete operation in array.

The Time Complexity of different operations in an array is:
| ARRAY OPERATION| REAL TIME COMPLEXITY | ASSUMED TIME COMPLEXITY | 
| :---: | :---: | :---: | 
| Access i-th element	 | O(√N) | O(1) | 
| Traverse all elements | O(N + √N)| O(N) |
| Override element at i-th index | O(√N) | O(1) |
| Insert element E | O(N + √N) | O(N) |
| Delete element E | O(N + √N) | O(N) |

## Space Complexity of Array
The Space Complexity of the above array operations is O(1).

This is because we do not need extra space beyond a fixed number of variables.

For some operations, you may need extra space of the order of O(N). For example, sorting an array using a sorting algorithm that is not in-place.