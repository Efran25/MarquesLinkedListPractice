package com.efran.gridworld;

/**
 * Created by Efran25 on 4/16/2016.
 */
public class LinkList {
    Node head;

    public LinkList() {
        //
    }

    public LinkList(int x) {
        head.val = x;
        head.next = null;
    }

    public LinkList(int x, Node n) {
        head.val = x;
        head.next = n;
    }

    public void insert(int x) {
        Node n = new Node(x);
        n.next = head;
        head = n;
    }

    public void clear() {
        head = null;
    }

    public int size() {
        int count = 0;
        Node curr = head;

        while(curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public void print() {
        Node curr = head;
        while(curr !=null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public boolean isEmpty(int x) {
        if (head == null)
            return true;
        else
            return false;
    }

    public boolean contains(int x) {
        Node curr = head;
        while(curr != null){
            if (curr.val == x)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public void remove(int x) {
        if(isEmpty(x)) {
            System.out.println("The list is empty.");
            return;
        }
        Node prev = head;

        while(prev != null) {
            //
        }
    }
}
