package com.student;

import java.util.*;

public class LinkedListDemo {

public static void main(String[] args){
    LinkedList<String> list = new LinkedList<String>();
    list.add("Ved");
    list.add("Prutha");
    list.add("Shivansh");
    list.add("Rudra");
    list.add("Rugved");

    System.out.println("List is:"+ list);
    list.addFirst("Anaya");
    list.addLast("Anahita");
    System.out.println(" Now List is:"+ list);

    list.add(3,"Dev");
    System.out.println(" Now updated List is :"+ list);

    Iterator<String> itr =list.iterator();
    while(itr.hasNext()) {
        System.out.println(itr.next());
    }

}
}
