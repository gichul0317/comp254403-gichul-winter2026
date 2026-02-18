package ex3;

import java.io.File;

public class Exercise3 {
    // find file path
    public static void find(String path, String filename) {
        File file = new File(path); // create File object

        System.out.println();
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
    }

    // main for testing
    public static void main(String[] args) {
        String path = "/Users/gichul/Desktop/winter2026/comp254-algorithms/Lab3/src/ex3";   // start path
        String file = "test.txt";   // target file name

        find(path, file); // call find
    }
}
