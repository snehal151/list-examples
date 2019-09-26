package com.student;

import java.util.*;

public class VectorDemo {


        public static void main(String args[]) {
            Vector<String> vec = new Vector<>(2);

            vec.addElement("Mango");
            vec.addElement("Apple");
            vec.addElement("Orange");
            vec.addElement("Banana");

            System.out.println("Size is:" + vec.size());
            System.out.println("Capacity increment is" + vec.capacity());

            vec.addElement("F1");
            vec.addElement("F2");
            vec.addElement("F3");

            System.out.println("Size After addition:" + vec.size());
            System.out.println("Capacity after incrementation:" + vec.capacity());

            // display

            Enumeration en = vec.elements();
            System.out.println("Elements are:");
            while (en.hasMoreElements())
                System.out.println(en.nextElement());
        }

}
