package ex2;

public class Exercise2 {
    // main for testing
    public static void main(String[] args) {
        // create sortedtablemap
        SortedTableMap<Integer, String> map = new SortedTableMap<>();

        // insert values
        map.put(1, "A");
        map.put(2, null);   // value is null

        // test containsKey
        System.out.println(map.containsKey(1)); // true (exists)
        System.out.println(map.containsKey(2)); // true (exists, value is null)
        System.out.println(map.containsKey(3)); // false

        // compare with get()
        System.out.println(map.get(2)); // null (key exists)
        System.out.println(map.get(3)); // null (key not exist)
    }
}
