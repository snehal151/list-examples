package com.student;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int roll;
    String name;
}

public class StudentInfo {

        public static void main(String[] args){
            ArrayList<String> list1 = new ArrayList<String>();
            ArrayList list2 = new ArrayList();

            Student s1 = new Student();
            s1.name ="Sneha";
            s1.roll = 101;

            list1.add("Anahita");
            list1.add("Boby");
            list1.add("Casper");
            list1.add("Dev");
            list1.add("Emma");

            list2.add("India");
            list2.add("1212");
            list2.add(2.2);
            list2.add(100);
            list2.add(21);
            list2.add(s1);

            System.out.println(" List1 :"+list1);
            System.out.println(" List2 :"+list2);

            String name = list1.get(2);
            System.out.println("Name is:"+ name);

            Object o =list2.get(2);
            System.out.println("O is:"+ o);

            list1.set(2,"Reva");
            System.out.println("Now List1 is:" + list1);

            list1.remove(4);
            System.out.println("After Remove List1 is:" + list1);

            if(list1.contains("Sneha"))
                System.out.println("Present in List");
            else
                System.out.println("Not in List");

            System.out.println("Iterating with enhancce for loop");
            for( String str:list1){
                System.out.println(str);
            }
            System.out.println("======================");

            System.out.println("Iterating with for loop");
            for(int i = 0;i<list1.size();i++){
                System.out.println(list1.get(i));
            }
            System.out.println("======================");

            System.out.println("Iterarting with iterator");
            Iterator<String> itr= list1.iterator();
            System.out.println(itr.next());
            System.out.println(itr.next());
            System.out.println(itr.next());

            System.out.println("Iterarting with iterator");
            Iterator<String> itr1= list1.iterator();
            System.out.println(itr1.next());
            System.out.println(itr1.next());
            System.out.println(itr1.next());

            while(itr.hasNext()){
                String str =itr.next();
                System.out.println(str);

                if (str.equals("Roma"));
                System.out.println("str");

                itr.remove();
                System.out.println("List After iteration" + list1);


            }


        }
}
