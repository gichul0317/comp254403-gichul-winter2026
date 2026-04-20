package ex2;

public class MergeSort {
    public static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2) {
        // create new LinkedQueue
        Queue<Integer> result = new LinkedQueue<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.first() <= q2.first()) {
                result.enqueue(q1.dequeue()); // take smaller from q1
            } else {
                result.enqueue(q2.dequeue()); // take smaller from q2
            }
        }

        while (!q1.isEmpty()) {
            result.enqueue(q1.dequeue()); // add remaining items from q1
        }

        while (!q2.isEmpty()) {
            result.enqueue(q2.dequeue()); // add remaining items from q2
        }

        return result; // return merged sorted queue
    }

    public static Queue<Integer> mergeSort(Queue<Integer> input) {
        // queue of queues here
        Queue<Queue<Integer>> queues = new LinkedQueue<>();

        while (!input.isEmpty()) {
            Queue<Integer> single = new LinkedQueue<>();
            single.enqueue(input.dequeue()); // put one item in its own queue
            queues.enqueue(single); // add single-item queue
        }

        while (queues.size() > 1) {
            Queue<Integer> q1 = queues.dequeue(); // first queue
            Queue<Integer> q2 = queues.dequeue(); // second queue

            Queue<Integer> merged = merge(q1, q2); // merge them
            queues.enqueue(merged); // add merged queue
        }

        return queues.dequeue(); // final sorted queue
    }
}
