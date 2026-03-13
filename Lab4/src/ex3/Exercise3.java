package ex3;

public class Exercise3 {
    // main for testing
    public static void main(String[] args) {
        LinkedQueue<Integer> Q1 = new LinkedQueue<>();   // create first Linked queue
        LinkedQueue<Integer> Q2 = new LinkedQueue<>();   // create second Linked queue

        // add elements to Q1
        Q1.enqueue(1);
        Q1.enqueue(2);
        Q1.enqueue(3);

        // add elements to Q2
        Q2.enqueue(4);
        Q2.enqueue(5);
        Q2.enqueue(6);

        System.out.println("Before:");
        System.out.println("Q1 = " + Q1);
        System.out.println("Q2 = " + Q2);

        // call concatenate method to append Q2 to Q1
        Q1.concatenate(Q2);

        // print the result after append
        System.out.println("\nAfter:");
        System.out.println("Q1 = " + Q1);
        System.out.println("Q2 = " + Q2);
    }
}
