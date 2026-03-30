package ex2;

public class Exercise2 {
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

        // print subtree height for each node
        tree.printSubtreeHeights(tree.root());
    }
}
