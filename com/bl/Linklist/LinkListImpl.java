package com.bl.Linklist;

public class LinkListImpl<T> {
	Node head;
	Node temp;
	Node tail;
	

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
	
	public void insertAtStart(T key) {
		Node<T>node = new Node<>(key);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		temp = head;
		head = node;
		head.next = temp;
	}

	@Override
	public String toString() {
		return "LinkListImpl [head=" + head + " , temp=" + temp + ", tail=" + tail + "]";
	}
	
}
