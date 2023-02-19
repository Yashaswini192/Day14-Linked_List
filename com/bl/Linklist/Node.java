package com.bl.Linklist;

public class Node<T> {
	T key;
	Node next;

	public Node(T key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", next=" + next + "]";
	}

	
}
