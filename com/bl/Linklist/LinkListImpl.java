package com.bl.Linklist;

public class LinkListImpl<T> {
	Node head;
	Node temp;
	Node tail;
	int count = 0;


	public void add(T key) {
		Node<T>node = new Node<>(key);
		if(head == null) {
			head = node;
			return;
		}
		temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;

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

	public void append(T key) {
		Node<T>node = new Node<>(key);
		if(head == null) {
			head = node;
			return;
		}
		temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	public void insertBetween(T key) { 
		Node<T>node = new Node<>(key);
		if(head != null) {
			head = temp;
			temp = head.next;
			head.next = node;
			//temp = node ;
			node.next = temp;
		}
		temp.next = tail;
	}

	public void pop(T key) {
		Node<T>node = new Node<>(key);
		if(head != null) {
			temp = head;
			head = head.next;
			temp = null;
		}
	}


	public void popLast(T key) {
		Node<T>node = new Node<>(key); if(head != null)
			if(head != null) {
				temp.next = null;
			}

	}

	public Node<T> searchNode(T key) {
		Node<T>temp = head;
		Node<T>searchNode = null;
		while(temp != null) {
			if(temp.key.equals(key)) {
				searchNode = temp;
				break;
			}
			temp = temp.next;
		}
		return searchNode;
	}
	

	@Override
	public String toString() {
		return "LinkListImpl [head=" + head + " , temp=" + temp + ", tail=" + tail + "]";
	}

}
