package es.dim45.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("MIN: " + Thread.MIN_PRIORITY);
        System.out.println("MAX: " + Thread.MAX_PRIORITY);
        System.out.println("NORMAL: " + Thread.NORM_PRIORITY);

        Deque<String> states = new ArrayDeque<String>();

        states.add("Germany");
        states.add("France");
        states.push("UK");
        states.offerLast("Norway");

        String sPop = states.pop();
        String sPeek = states.peek();
        String sPeekLast = states.peekLast();
        states.offer(sPop);
        String sPollLast = states.pollLast();

        while (states.peek() != null) {
            System.out.print(states.pop());
        }
    }
}
