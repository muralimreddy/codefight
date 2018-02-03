package com.codefight.interviewpractice;

public class RemoveKFromList {

	public static void main(String[] args) {
		//[3, 1, 2, 3, 4, 5]
		ListNode<Integer> n0= new ListNode<Integer>(0);
		
		ListNode<Integer> n1= new ListNode<Integer>(3);
		n0.next = n1;
		ListNode<Integer> n2= new ListNode<Integer>(1);
		n1.next = n2;
		ListNode<Integer> n3= new ListNode<Integer>(2);
		n2.next = n3;
		ListNode<Integer> n4= new ListNode<Integer>(3);
		n3.next = n4;
		ListNode<Integer> n5= new ListNode<Integer>(4);
		n4.next = n5;
		ListNode<Integer> n6= new ListNode<Integer>(5);
		n5.next = n6;
		
		ListNode<Integer> r = removeKFromList(n0, 3);
		
		
	}
	static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
		ListNode<Integer> result = null;
		ListNode<Integer> nextNode = l;
		while(true){
			int val = nextNode.value.intValue();
			if(val != k){
				if(result == null){
					result = nextNode;
				}else{
					result.next = nextNode;
				}
			}
			nextNode = nextNode.next;
			if(nextNode.next == null) break;
		}
		return result;
	}
}

class ListNode<T> {
	ListNode(T x) {
		value = x;
	}
	T value;
	ListNode<T> next;
}