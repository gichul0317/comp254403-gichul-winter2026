package ex3;

import java.io.File;

public class Exercise3 {
    // find file path
    public static void find(String path, String filename) {
        File file = new File(path); // create File object

        if (file.isFile()) {        // if current path is a file
            if (file.getName().equals(filename)) {      // if file name equals to given file name
                System.out.println("\nFile path is... : " + file.getAbsolutePath()); // print path
            }
        }

        else if (file.isDirectory()) {      // if current path is a directory
            for (String f: file.list()) {   // loop through contents
                File child = new File(file, f); // create child path
                find(child.getAbsolutePath(), filename); // recursive search
            }
        }
    }

    // main for testing
    public static void main(String[] args) {
        String path = "/Users/gichul/Desktop/winter2026/comp254-algorithms/Lab3/src/ex3";   // start path
        String file = "test.txt";   // target file name

        find(path, file); // call find
    }
}
