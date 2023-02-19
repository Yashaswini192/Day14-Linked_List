package com.bl.Linklist;

import java.util.LinkedList;

public class LinkListMain {

	public static void main(String[] args) {
		LinkListImpl  L1 = new LinkListImpl();
		/*
		 * L1.add(70); L1.add(30); L1.add(56);
		 */

		/*
		 * L1.insertAtStart(70); L1.insertAtStart(30); L1.insertAtStart(56);
		 */

		L1.append(56);		
		L1.append(30);
		L1.append(70);
		System.out.println(L1);

		//L1.insertBetween(30);
		//System.out.println("\n"+L1);

		//L1.pop(56);
		//System.out.println("\n"+L1);

		//L1.popLast(70);
		//System.out.println("\n"+L1);

		L1.searchNode(30);
		System.out.println("\n"+L1.searchNode(30));

	}
}
