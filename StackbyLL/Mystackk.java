package com.test.stack;
//MANUALLY ADDING ALL FUNCTIONS
import java.util.Stack;

class Node{
	 int data;
	 Node next;
	 Node(int x){
		 data=x;
		 next=null;
	 }
 }
//stack by Linked list
class Mystack {
	Node top; //top of stack
	Mystack(){
		top=null;
	}
	

void push(int x) {
	Node temp= new Node(x);
	temp.next=top;
	top=temp;
} 
//print the values;
public void display() {
	Node temp=top;
	while(temp!=null) {
	 System.out.print(temp.data+" ");
	 temp=temp.next;
	}
	System.out.println();	
}

int pop() {
	
	if(top==null) {
		System.out.println("No element in stack ");
		return -1;
	}
		Node temp=top;
		top=top.next;
		int value=temp.data;
		return value;
		
	
}

int peek() {
	if(top==null) {
		System.out.println("Stack is empty");
		return -1;
	}
	return top.data;
}

boolean isEmpty() {
	return top==null;
}

int size() {
int count=0;
Node temp=top;
if(top==null) {
 return -1;
}
while(temp!=null) {
	count++;
	temp=temp.next;
}
return count;
}
	
	
	public static void main(String[] args) {
		Mystackk s = new Mystackk();
		//push elements
		System.out.println("Entering the values in Stack:");
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		s.display();
		//popping of the element
		System.out.println("Popped element "+s.pop());
		
		//getting the top element in stack using LL
		System.out.println("Top Element is: "+ s.peek());
	

	//check whether stack is empty or not
	System.out.println("Is Stack empty ? :"+ (s.isEmpty()? "yes": "No"));
	//size of stack
 System.out.println("Stack after doing all operation--");
 s.display();
 
 System.out.println("Size of Stack now: "+ s.size());


}

	
}
