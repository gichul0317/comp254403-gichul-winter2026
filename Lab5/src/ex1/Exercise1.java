package ex1;

public class Exercise1 {
    // textNext method here
    public static <E> void testNext(LinkedBinaryTree<E> tree, Position<E> p) {
        // get next node in preorder
        Position<E> next = tree.preorderNext(p);

        // if there is no next node
        if (next == null) {
            System.out.println(p.getElement() + " -> null");
        }
        // print the next node element
        else {
            System.out.println(p.getElement() + " -> " + next.getElement());
        }
    }

    // main for testing
    public static void main(String[] args) {
        // create new LinkedBinaryTree
        LinkedBinaryTree<String> tree = new LinkedBinaryTree<>();

        // add nodes
        Position<String> A = tree.addRoot("A");
        Position<String> B = tree.addLeft(A, "B");
        Position<String> C = tree.addRight(A, "C");
        Position<String> D = tree.addLeft(B, "D");
        Position<String> E = tree.addRight(B, "E");
        Position<String> F = tree.addLeft(C, "F");
        Position<String> G = tree.addRight(C, "G");

        // preorder should be: A B D E C F G
        testNext(tree, A); // B
        testNext(tree, B); // D
        testNext(tree, D); // E
        testNext(tree, E); // C
        testNext(tree, C); // F
        testNext(tree, F); // G
        testNext(tree, G); // null
    }

    /*
    What are the worst-case running times of your algorithms?
    - The worst-case running time of preorderNext(p) is O(h), where h is
    the height of the tree. This occurs when the algorithm must move up
    the tree to find the next node.
     */
}
