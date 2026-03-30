package ex3;

public class Exercise3 {
    // main for testing
    public static void main(String[] args) {
        // create priority queue
        HeapPriorityQueue<Integer, String> priorityQueue = new HeapPriorityQueue<>();

        // insert key-value pairs
        priorityQueue.insert(20, "A");
        priorityQueue.insert(15, "B");
        priorityQueue.insert(10, "C");
        priorityQueue.insert(5, "D");

        // remove smallest key first (priority)
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.removeMin().getKey());
        }
    }
}
