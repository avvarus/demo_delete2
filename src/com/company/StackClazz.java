package com.company;

import java.util.*;

public class StackClazz {


    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(123);
        integerStack.push(234);
        integerStack.push(456);

        System.out.println("integerStack = " + integerStack);

        integerStack.pop();
        System.out.println("integerStack after pop= " + integerStack);

        Hashtable<Integer, String> hashtable = new Hashtable();
        HashMap hashMap = new HashMap();

//        Stack stack = new Stack();
//        stack.push("tester");
//        stack.push(123);

        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        Stack stack = new Stack();
        while (list.size() > 0) {

            stack.push(list.remove(0));
            System.out.println(stack);
        }

        while (stack.size() > 0) {
            list.add(stack.pop());
        }

        System.out.println(list);


    }
}
