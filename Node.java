package linkedList;

public class Node{
 int data;
 Node next;
 
 Node(int data)
 {
	 this.data=data;
	 
 }
 Node(int data,Node x)
 {
	 this.data=data;
	 this.next=x;
 }
}
