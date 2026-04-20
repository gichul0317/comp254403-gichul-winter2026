package ex2;

public class Exercise2 {
    // main for testing
    public static void main(String[] args) {
        // new LinkedQueue
        Queue<Integer> input = new LinkedQueue<>();

        // add unsorted numbers
        input.enqueue(5);
        input.enqueue(2);
        input.enqueue(8);
        input.enqueue(1);
        input.enqueue(3);
        input.enqueue(7);
        input.enqueue(4);
        input.enqueue(6);

        // sort the queue by calling mergeSort
        Queue<Integer> sorted = MergeSort.mergeSort(input);

        // print sorted result
        System.out.println("After sort: ");
        while (!sorted.isEmpty()) {
            System.out.print(sorted.dequeue() + " ");
        }
    }
}
