package ex1;

public class Exercise1 {
    // main for testing
    public static void main(String[] args) {
        // create new LinkedPositionalList
        LinkedPositionalList<String> list = new LinkedPositionalList<>();

        // insert elements
        Position<String> p1 = list.addLast("A");
        Position<String> p2 = list.addLast("B");
        Position<String> p3 = list.addLast("C");

        // print out indexes
        System.out.println(list.indexOf(p1)); // 0
        System.out.println(list.indexOf(p2)); // 1
        System.out.println(list.indexOf(p3)); // 2
    }
}