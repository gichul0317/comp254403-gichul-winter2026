package ex2;

import java.util.Stack;

public class Exercise2 {
    // transfer method here
    public static <E> void transfer(Stack<E> S, Stack<E> T) {
        while (!S.isEmpty()) {  // while S is not empty
            T.push(S.pop());    // move element to T
        }
    }

    // main for testing
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();  // create Stack S
        Stack<Integer> T = new Stack<>();  // create Stack T

        // push elements to Stack S
        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);

        // transfer elements in S to T
        transfer(S, T);

        while (!T.isEmpty()) {          // while T is not empty
            System.out.println(T.pop());    // pop and display elements in T
        }
    }
}
