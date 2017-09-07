package com.lena.learn.exceptions.dima.collections.vector;

import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by dmitry on 02.09.17.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("dfdf");
        linkedList.add("dddd");
        linkedList.add("dddd3");
        linkedList.add("dddd4");
        linkedList.add("dddd5");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.indexOf(linkedList.get(i)));
        }

        linkedList.remove(2);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.indexOf(linkedList.get(i)));
        }
        Iterator iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next.equals("dddd")) {
                linkedList.remove(2);
            }
            System.out.println(next);
        }
    }
}
