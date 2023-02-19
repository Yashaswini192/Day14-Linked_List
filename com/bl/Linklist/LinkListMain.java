package com.bl.Linklist;

public class LinkListMain {

	public static void main(String[] args) {
		LinkListImpl  L1 = new LinkListImpl();
		/*
		 * L1.add(70); L1.add(30); L1.add(56);
		 */
		
		L1.insertAtStart(70);
		L1.insertAtStart(30);
		L1.insertAtStart(56);
		
		System.out.println(L1);
		
	}
}
