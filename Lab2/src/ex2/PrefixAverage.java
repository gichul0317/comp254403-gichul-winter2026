package ex2;
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
 * Demonstration of algorithms for computing the prefix averages of an array.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class PrefixAverage {

  /** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
  public static double[] prefixAverage1(double[] x) {
    int n = x.length;
    double[] a = new double[n];    // filled with zeros by default
    for (int j=0; j < n; j++) {
      double total = 0;            // begin computing x[0] + ... + x[j]
      for (int i=0; i <= j; i++)
        total += x[i];
      a[j] = total / (j+1);        // record the average
    }
    return a;
  }

  /** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
  public static double[] prefixAverage2(double[] x) {
    int n = x.length;
    double[] a = new double[n];    // filled with zeros by default
    double total = 0;              // compute prefix sum as x[0] + x[1] + ...
    for (int j=0; j < n; j++) {
      total += x[j];               // update prefix sum to include x[j]
      a[j] = total / (j+1);        // compute average based on current sum
    }
    return a;
  }

  // main method for perform experimental analysis
  public static void main(String[] args) {
    int n = 500;      // starting value
    int trials = 10;  // number of tests
    int start = n;

    // test prefixAverage2 (O(n) first)
    System.out.println("Testing prefixAverage2...");
    for (int t=0; t<trials; t++) {
      double[] testArr = new double[n]; // create input array of size n
      for (int i=0; i<n; i++) {
        testArr[i] = i;    // create elements in the testArr with value of 0.0, 1,0, 2.0, ...
      }

      long startTime = System.currentTimeMillis(); // measure start time
      double[] temp = prefixAverage2(testArr); // run using generated array of prefixaverage2
      long endTime = System.currentTimeMillis(); // measure end time
      long elapsed = endTime - startTime; // measure elapsed time
      System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed)); // print result
      n *= 2;
    }

    // test prefixAverage1 (O(n^2))
    System.out.println("\nTesting prefixAverage1...");
    n = start;
    for (int t=0; t<trials; t++) {
      double[] testArr = new double[n]; // create input array of size n
      for (int i=0; i<n; i++) {
        testArr[i] = i;    // create elements in the testArr with value of 0.0, 1,0, 2.0, ...
      }

      long startTime = System.currentTimeMillis(); // measure start time
      double[] temp = prefixAverage1(testArr); // run using generated array of prefixaverage1
      long endTime = System.currentTimeMillis(); // measure end time
      long elapsed = endTime - startTime; // measure elapsed time
      System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed)); // print result
      n *= 2;
    }
  }
}
