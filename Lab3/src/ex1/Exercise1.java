package ex1;

public class Exercise1 {
    // recursive algorithm to compute product of two positive integers m and n
    public static int productOfTwo(int m, int n) {
        // if number of n is 0
        if (n == 0) {
            return 0; // m * n always 0 so return 0.
        }
        else {
            return m + productOfTwo(m, n-1); // count down n and add m recursively
        }
    }

    // main method for testing
    public static void main(String[] args) {
        int firstVal = 7;   // first value
        int secondVal = 6;  // second value

        int result = productOfTwo(firstVal, secondVal); // call productOfTwo
        System.out.println("Product of " + firstVal + " and " + secondVal+ " is: " + result); // print result
    }
}
