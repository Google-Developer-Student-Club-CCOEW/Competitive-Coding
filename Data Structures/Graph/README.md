<b> <h2>WHAT IS A GRAPH DATA STRUCTURE? </h2></b> </br> 
A Graph is a non-linear data structure consisting of vertices and edges. The vertices are sometimes also referred to as nodes and the edges are lines or arcs that connect any two nodes in the graph. </br> More formally a Graph is composed of a set of vertices( V ) and a set of edges( E ). The graph is denoted by G(E, V).


<b><h3>Components of a Graph </h3></b>	
<b>Vertices</b>: Vertices are the fundamental units of the graph. Sometimes, vertices are also known as vertex or nodes. Every node/vertex can be labeled or unlabelled. </br>
<b>Edges</b>: Edges are drawn or used to connect two nodes of the graph. It can be ordered pair of nodes in a directed graph. Edges can connect any two nodes in any possible way. There are no rules. Sometimes, edges are also known as arcs. Every edge can be labeled/unlabelled. </br>
<b><h4>USE OF GRAPHS</h4></b>
Graphs are used to solve many real-life problems. Graphs are used to represent networks. The networks may include paths in a city or telephone network or circuit network. Graphs are also used in social networks like linkedIn, Facebook. For example, in Facebook, each person is represented with a vertex(or node). Each node is a structure and contains information like person id, name, gender, locale etc.
  
<img width="386" alt="Capture" src="https://user-images.githubusercontent.com/65736744/198825808-6984e757-9212-470d-a33d-9135be4b4d9f.png">
<h2>Graph Representation</h2>
<i>Graphs are commonly represented in two ways:</i>

 <h2>Adjacency Matrix</h2>
An adjacency matrix is a 2D array of V x V vertices. Each row and column represent a vertex.

If the value of any element a[i][j] is 1, it represents that there is an edge connecting vertex i and vertex j.

Since it is an undirected graph, for edge (0,2), we also need to mark edge (2,0); making the adjacency matrix symmetric about the diagonal.

Edge lookup(checking if an edge exists between vertex A and vertex B) is extremely fast in adjacency matrix representation but we have to reserve space for every possible link between all vertices(V x V), so it requires more space.

<img width="469" alt="Capture1" src="https://user-images.githubusercontent.com/65736744/198825984-676c8f8b-29c7-44b4-8f0d-882a19474d20.png">


 <h2>Adjacency List</h2>
An adjacency list represents a graph as an array of linked lists.

The index of the array represents a vertex and each element in its linked list represents the other vertices that form an edge with the vertex.

The adjacency list for the graph we made in the first example is as follows:


<img width="538" alt="Capture2" src="https://user-images.githubusercontent.com/65736744/198825991-8878373c-2268-4fc7-aadf-d6f27ec14fd3.png">

<b><h2>TRAVERSING GRAPH</h2></b>
<h3>BFS TRAVERSAL </h3>

<h4>Follow the below method to implement BFS traversal.</h4>
<h4>
Declare a queue and insert the starting vertex. </br>
Initialize a visited array and mark the starting vertex as visited.</br>
Follow the below process till the queue becomes empty:</br>
Remove the first vertex of the queue.</br>
Mark that vertex as visited.</br>
Insert all the unvisited neighbours of the vertex into the queue. </h4> </br>
  
  <img width="395" alt="Capture4" src="https://user-images.githubusercontent.com/65736744/198827071-5719e743-0386-4049-8f7b-af08850649f0.png">

// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s. </br>

import java.io.*; 
import java.util.*;

class Graph
{
	private int V;// No. of vertices 
	private LinkedList<Integer> adj[]; //Adjacency Lists

	// Constructor
	Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}

	// prints BFS traversal from a given source s
	void BFS(int s)
	{
		// Mark all the vertices as not visited(By default
		// set as false)
		boolean visited[] = new boolean[V];

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s]=true;
		queue.add(s);

		while (queue.size() != 0)
		{
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s+" ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext())
			{
				int n = i.next();
				if (!visited[n])
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	// Driver method to
	public static void main(String args[])
	{
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal "+
						"(starting from vertex 2)");

		g.BFS(2);
	}
}
Following is Breadth First Traversal (starting from vertex 2) 
2 0 3 1 
  
  Time Complexity: O(V+E), where V is the number of nodes and E is the number of edges.
Auxiliary Space: O(V)



  <h3>DFS TRAVERSAL </h3>
  
  Follow the below steps to solve the problem:</br>

Create a recursive function that takes the index of the node and a visited array.</br>
Mark the current node as visited and print the node.</br>
Traverse all the adjacent and unmarked nodes and call the recursive function with the index of the adjacent node.</br>
  ![ezgif com-gif-maker61](https://user-images.githubusercontent.com/65736744/198827092-ee194778-a533-469a-abff-3f78319d5b4d.gif)
  </br>
Below is the implementation of the above approach:

// Java program to print DFS
// traversal from a given
// graph
import java.io.*;
import java.util.*;

// This class represents a
// directed graph using adjacency
// list representation
class Graph {
	private int V; // No. of vertices

	// Array of lists for
	// Adjacency List Representation
	private LinkedList<Integer> adj[];

	// Constructor
	@SuppressWarnings("unchecked") Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w)
	{
		adj[v].add(w); // Add w to v's list.
	}

	// A function used by DFS
	void DFSUtil(int v, boolean visited[])
	{
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");

		// Recur for all the vertices adjacent to this
		// vertex
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

	// The function to do DFS traversal.
	// It uses recursive
	// DFSUtil()
	void DFS(int v)
	{
		// Mark all the vertices as
		// not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper
		// function to print DFS
		// traversal
		DFSUtil(v, visited);
	}

	// Driver's Code
	public static void main(String args[])
	{
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println(
			"Following is Depth First Traversal "
			+ "(starting from vertex 2)");

		// Function call
		g.DFS(2);
	}
}
                          
Time complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
Auxiliary Space: O(V), since an extra visited array of size V is required.
  
  
