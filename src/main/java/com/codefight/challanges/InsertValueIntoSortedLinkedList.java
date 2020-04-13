package com.codefight.challanges;

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
