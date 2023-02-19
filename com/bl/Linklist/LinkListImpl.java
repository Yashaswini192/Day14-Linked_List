package com.bl.Linklist;

public class LinkListImpl<T> {
	Node head;
	Node temp;
	
	public void add(T key) {
		Node<T>node = new Node<>(key);
		if(head == null) {
			head = node;
			return;
		}
		temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}

	@Override
	public String toString() {
		return "LinkList1 [head=" 
				+ head + ", temp="
				+ temp + "]";
	}
}
