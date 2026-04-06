package ex1;

import java.util.Random;

public class Exercise1 {
    // main for testing
    public static void main(String[] args) {
        int n = 50000;              // random keys
        int[] keys = new int[n];
        Random rand = new Random(42);

        for (int i = 0; i < n; i++) {
            keys[i] = rand.nextInt(1000000);    // generate random keys
        }

        double[] loads = {0.25, 0.5, 0.75};     // load factors to test

        for (double load : loads) {
            // create chainhashmap
            ChainHashMap<Integer, Integer> map = new ChainHashMap<>(17, load);

            long startPut = System.nanoTime();
            for (int key : keys) {
                map.put(key, key);  // insert k-v pairs
            }
            long endPut = System.nanoTime();

            long startGet = System.nanoTime();
            for (int key : keys) {
                map.get(key);   // searches for each key
            }
            long endGet = System.nanoTime();

            System.out.println("Load factor = " + load);    // current load factor
            System.out.println("put time = " + (endPut - startPut) / 1_000_000.0 + " ms");  // insertion time
            System.out.println("get time = " + (endGet - startGet) / 1_000_000.0 + " ms");  // search time
            System.out.println();
        }
    }
}