package ex3;

import java.io.File;

public class Exercise3 {
    // find file path
    public static void find(String path, String filename) {
        File file = new File(path);
        System.out.println(filename);
        System.out.println(file.getName()); // ex3
        System.out.println("File path: " + file.getPath());
        System.out.println("File path: " + file.getAbsolutePath());
    }

    // main for testing
    public static void main(String[] args) {
        String path = "/Users/gichul/Desktop/winter2026/comp254-algorithms/Lab3/src/ex3";
        String file = "test.txt";

        find(path, file);
    }
}
