package com.efran.gridworld;

/**
 * Created by Efran25 on 4/16/2016.
 */
public class Node {
    int val;
    Node next;

    public Node() {
        //
    }
    public Node(int x) {
        val = x;
        next = null;
    }
    public Node(int x, Node n) {
        val = x;
        next = n;
    }
}
