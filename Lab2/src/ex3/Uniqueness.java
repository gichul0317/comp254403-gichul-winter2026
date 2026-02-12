package ex3;
/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.Arrays;

/**
 * Demonstration of algorithms for testing element uniqueness.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Uniqueness {

  /** Returns true if there are no duplicate elements in the array. */
  public static boolean unique1(int[] data) {
    int n = data.length;
    for (int j=0; j < n-1; j++)
      for (int k=j+1; k < n; k++)
        if (data[j] == data[k])
          return false;                    // found duplicate pair
    return true;                           // if we reach this, elements are unique
  }

  /** Returns true if there are no duplicate elements in the array. */
  public static boolean unique2(int[] data) {
    int n = data.length;
    int[] temp = Arrays.copyOf(data, n);   // make copy of data
    Arrays.sort(temp);                     // and sort the copy
    for (int j=0; j < n-1; j++)
      if (temp[j] == temp[j+1])            // check neighboring entries
        return false;                      // found duplicate pair
    return true;                           // if we reach this, elements are unique
  }

  // main method to perform testing
  public static void main(String[] args) {
    long oneMinute = 60000; // 1 minute time limit
    int n = 1000; // start size

    // test unique2 (O(n log n)
    System.out.println("Determine the largest value of n for unique 2...");

    // repeat until passing time limit or memory limit
    while (true) {
      try {
        int[] testArr = new int[n]; // create array of size 1000

        for (int i=0; i<n; i++) {
          testArr[i] = i; // assign values in testArr
        }

        long start = System.currentTimeMillis(); // start time
        unique2(testArr);                        // run unique2
        long end = System.currentTimeMillis();   // end time
        long elapsed = end - start;              // elapsed time

        System.out.println(String.format("n: %d     time: %3dms", n, elapsed)); // print result

        // if exceed 1 minute limit stop test
        if (elapsed > oneMinute) {
          System.out.println("Exceed 1 minute at n: " + n);
          break;
        }

        n *= 2; // double start size

      } catch (Error e){
        System.out.println(e.toString()); // if memory error occured
        break;
      }
    }

    // test unique1 (O(n^2))
    n = 1000; // reset start size

    System.out.println("\nDetermine the largest value of n for unique 1...");

    // repeat until passing time limit or memory limit
    while (true) {
      try {
        int[] testArr = new int[n]; // create array of size 1000

        for (int i=0; i<n; i++) {
          testArr[i] = i; // assign values in testArr
        }

        long start = System.currentTimeMillis(); // start time
        unique1(testArr);                        // run unique1
        long end = System.currentTimeMillis(); // end time
        long elapsed = end - start;            // elapsed time

        System.out.println(String.format("n: %d     time: %3dms", n, elapsed)); // print result

        // if exceed 1 minute limit stop test
        if (elapsed > oneMinute) {
          System.out.println("Exceed 1 minute at n: " + n);
          break;
        }

        n *= 2; // double start size

      } catch (Error e){
        System.out.println(e.toString()); // if memory error occured
        break;
      }
    }
  }
}
