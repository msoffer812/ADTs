package stackADT;
import java.util.*;
//ADT for Generic Stack
public class GenericStack <T> {
	private Node<T> top;//pointer to top of the stack
	private int size;
	
	//Constructor
	public GenericStack()//No-arg constructor
	{
		this.top = null;
		size = 0;
	}
	@SuppressWarnings("unchecked")
	public GenericStack(T data)
	{
		this.top = new Node(data);
		size = 1;
	}
	//Add element to top of stack
	public void push(T data)
	{
		Node<T> n = new Node<T>(data, top);
		this.top = n;
		size++;
	}
	//Remove and return element from top of the list
	public T pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		T data = (T)top.getData();
		this.top = this.top.getNext();
		size--;
		return data;
	}
	//Shows the element off the top off the stack
	public T peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return (T)top.getData();
	}
	//Returns if Stack is empty
	public boolean isEmpty()
	{
		if(this.size() == 0)
		{
			return true;
		}
		return false;
	}
	//returns size of the stack
	public int size()
	{
		return this.size;
	}
	
	private class Node <T> {
		private T data;
		private Node<T> next;
		
		//Constructor if only given data
		public Node(T data)
		{
			this.data = data;
			next = null;
		}
		
		//Constructor if also have link to the rest of the list
		public Node(T data, Node next)
		{
			this.data = data;
			this.next = next;
		}
		
		//Getters
		public T getData()
		{
			return this.data;
		}
		public Node<T> getNext()
		{
			return this.next;//don't care if it's null
		}
		//Setters
		public void setData(T data)
		{
			this.data = data;
		}
		public void setNext(Node next)
		{
			this.next = next;
		}
	}
}
