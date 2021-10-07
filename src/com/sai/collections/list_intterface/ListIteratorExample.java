package com.sai.collections.list_intterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "мадам";

        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {

            if (!iterator.next().equals(reverseIterator.previous())) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("result: " + isPalindrome);


    }

}
