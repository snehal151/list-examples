package com.student;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDeleteDemo {

    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Sneha");
        list.add("Krushnat");
        list.add("Kop");
        list.add("Sangli");
        list.add("India");
        list.add("UK");
        list.add("1529");

        System.out.println("List is:"+list);
        //remove first element
        list.removeFirst();
        System.out.println("List after removing first element:" +list);

        //remove Last element
        list.removeLast();
        System.out.println("List after removing last element:"+list);
        System.out.println("=============");
        //iterator
        Iterator<String> itr3= list.iterator();
            System.out.println(itr3.next());
            System.out.println(itr3.next());
            System.out.println(itr3.next());
            System.out.println("=============");

        //iterator
        Iterator<String> itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=============");
        // remove 2nd element
        list.remove(1);
        System.out.println("=============");
        //iterator
        Iterator<String> itr2= list.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        // get and set
        Object o1= list.get(0);
        System.out.println("First element:" +o1);
        list.set(0,"krush");
        Object o2= list.get(0);
        System.out.println("First element after update:"+ o2);

        System.out.println(list.clone());

        Object o3=list.pollFirst();
        System.out.println("List:"+list);

        list.removeLastOccurrence("1");
        System.out.println("List:"+list);

        Iterator it = list.descendingIterator();

        // Displaying list in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
