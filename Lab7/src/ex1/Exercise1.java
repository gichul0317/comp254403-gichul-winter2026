package ex1;

public class Exercise1 {
    public static void main(String[] args) {
        // create new TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // build BST
        map.put(50, "A");
        map.put(30, "B");
        map.put(70, "C");
        map.put(20, "D");
        map.put(40, "E");
        map.put(60, "F");
        map.put(80, "G");

        // successful searches
        System.out.println("Key exists");
        System.out.println("get(50): " + map.get(50));
        System.out.println("get(20): " + map.get(20));
        System.out.println("get(80): " + map.get(80));

        // unsuccessful search (no key)
        System.out.println("\nNo Key...");
        System.out.println("get(25): " + map.get(25));

        // more tests
        System.out.println("\nMore tests");
        System.out.println("get(60): " + map.get(60));
        System.out.println("get(100): " + map.get(100));
    }
}
