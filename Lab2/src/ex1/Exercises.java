package ex1;
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


/**
 * Code for end-of-chapter exercises on asymptotics.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Exercises {

  /** Returns the sum of the integers in given array. */
  public static int example1(int[] arr) {
    int n = arr.length, total = 0;  // n = size of the array (input size)
    for (int j=0; j < n; j++)       // loop from 0 to n-1 (loop runs n times)
      total += arr[j];              // operate in each iteration
    return total;                   // return final total value
  }
  /*
  O(n)
  - loop iterates each n times
  - running time grows as n grows
  - running time grows linearly as n grows
  */

  /** Returns the sum of the integers with even index in given array. */
  public static int example2(int[] arr) {
    int n = arr.length, total = 0;  // n = size of the array (input size)
    for (int j=0; j < n; j += 2)    // note the increment of 2
      total += arr[j];              // operate in each iteration (increment by 2)
    return total;                   // return final total value
  }
  /*
   O(n)
   - loop iterates each n times (only in increment of 2)
   - as same as above method, running time grows linearly as n grows
   */

  /** Returns the sum of the prefix sums of given array. */
  public static int example3(int[] arr) {
    int n = arr.length, total = 0;  // n = size of the array (input size)
    for (int j=0; j < n; j++)       // loop from 0 to n-1
      for (int k=0; k <= j; k++)    // loop from 0 to j
        total += arr[j];            // operate in each iteration
    return total;                   // return final total value
  }
  /*
  O(n^2)
  - outer loop runs n times
  - inner loop runs j + 1 times
  - n * n = n^2
  - running time grows quadratically (n^2)
   */

  /** Returns the sum of the prefix sums of given array. */
  public static int example4(int[] arr) {
    int n = arr.length, prefix = 0, total = 0; // n = size of the array (input size)
    for (int j=0; j < n; j++) {     // loop from 0 to n-1
      prefix += arr[j];             // operate in each iteration
      total += prefix;              // operate in each iteration
    }
    return total;                   // return final total value
  }
  /*
  O(n)
  - loop iterates n times
  - running time grows linearly as n grows
  - it is not nested loop
   */

  /** Returns the number of times second array stores sum of prefix sums from first. */
  public static int example5(int[] first, int[] second) { // assume equal-length arrays
    int n = first.length, count = 0;// n = size of the array (input size)
    for (int i=0; i < n; i++) {     // loop from 0 to n-1
      int total = 0;                // initial value of total = 0
      for (int j=0; j < n; j++)     // loop from 0 to n-1
        for (int k=0; k <= j; k++)  // loop from 0 to j
          total += first[k];        // operate in each iteration
      if (second[i] == total) count++; // check elements in second array with total value then increase count
    }
    return count;                   // return final count value
  }
  /*
  O(n^3)
  - outer loop runs n times
  - middle loop runs n times
  - inner loop runs j + 1 times
  - total run time = n * n * n= n^3
   */
}
