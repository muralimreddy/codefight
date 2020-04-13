package com.codefight.challanges;
/**
 * Note: Your solution should have O(n) time complexity, where n is the number of elements in l, since this is what you will be
 * asked to accomplish in an interview.
 *
 * You have a singly linked list l, which is sorted in strictly increasing order, and an integer value. Add value to the list l,
 * preserving its original sorting.
 *
 * Note: in examples below and tests preview linked lists are presented as arrays just for simplicity of visualization: in
 * real data you will be given a head node l of the linked list
 *
 * Example
 *
 * For l = [1, 3, 4, 6] and value = 5, the output should be
 * insertValueIntoSortedLinkedList(l, value) = [1, 3, 4, 5, 6];
 * For l = [1, 3, 4, 6] and value = 10, the output should be
 * insertValueIntoSortedLinkedList(l, value) = [1, 3, 4, 6, 10];
 * For l = [1, 3, 4, 6] and value = 0, the output should be
 * insertValueIntoSortedLinkedList(l, value) = [0, 1, 3, 4, 6].
 * For l=[] and value 239, the output should be
 * insertValueIntoSortedLinkedList(l, value) = [239].
 * For l=[1,3,4] and value -100, the output should be
 * insertValueIntoSortedLinkedList(l, value) = [-100, 1,3,4].
 */
public class InsertValueIntoSortedLinkedList {
    public static void main(String[] args){
        InsertValueIntoSortedLinkedList ins = new InsertValueIntoSortedLinkedList();

        ListNode<Integer> l1 = new ListNode<>(1);
        ListNode<Integer> l2 = new ListNode<>(3);
        ListNode<Integer> l3 = new ListNode<>(4);
        ListNode<Integer> l4 = new ListNode<>(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;

        ListNode<Integer> newList = ins.insertValueIntoSortedLinkedList(l1, 0);

    }


    ListNode<Integer> insertValueIntoSortedLinkedList(ListNode<Integer> l, int v) {
        boolean ex = true;
        ListNode<Integer> le = l;
        ListNode<Integer> ln = new ListNode<>(v);
        while(ex){
            if(le.next == null) { le.next = ln; ex = false; }
            if(v > le.value && (le.next != null && v < le.next.value)) {
                ln.next = le.next;
                le.next = ln;
                ex = false;
            }else if(v < le.value){
                ln.next = le;
                ex = false;
                l = ln;
            }else {
                le = le.next;
            }
        }
        return l;
    }
}
