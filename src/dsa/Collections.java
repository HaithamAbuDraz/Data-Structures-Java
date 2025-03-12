package dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collections {

    public static void main(String[] args) {
        //Dynamic Array
        ArrayList<String> array = new ArrayList<String>();
        array.add("Haitham");
        array.get(0);
        array.remove(0);

        //LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Haitham");

        //Stack
        Stack<String> stack = new Stack<String>(); //Dynamic Stack Array
        stack.push("Haitham");
        stack.pop();

        //Queue
        Queue<String> queue = new LinkedList<String>();
        queue.add("Haitham");
        queue.poll();

        //HashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(11, "Haitham");
        hashMap.get(11);

    }

}
