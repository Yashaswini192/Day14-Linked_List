package com.bl.Linklist;

public class LinkListImpl<T> {
	Node head;
	Node temp;
	Node tail;
	
	public void add(T key) {
		Node<T>node = new Node<>(key);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		temp = head;
		head = node;
		//while(temp.next!=null) {
		//	temp=temp.next;
		//}
		head.next = temp;
		//temp.next = tail;
		
	}

	@Override
	public String toString() {
		return "LinkListImpl [head=" + head + " , temp=" + temp + ", tail=" + tail + "]";
	}



	
}
