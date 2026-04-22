package com.gla;

import java.util.ArrayList;

public class Practice1 {

    static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Papaya");
        list.add("Orange");
        list.add("Mango");


        System.out.println("List of fruits :-"+list);

        String index0= list.get(0);
        System.out.println("At Index 0:-"+index0);

        list.set(0,"kivi");
        System.out.println("Updated LIst;-"+list);

        list.remove("kivi");
        System.out.println("kivi Removed "+list);


        boolean kivi=list.contains("kivi");
        System.out.println("kivi is present or not :-"+kivi);

        boolean isEmplty=list.isEmpty();
        System.out.println("list is empty or not:-"+isEmplty);

        int size = list.size();
        System.out.println("Size of the list:-"+size);

        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }



    }
}
