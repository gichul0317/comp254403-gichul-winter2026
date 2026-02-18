package ex2;

import java.util.Scanner;

public class Exercise2 {
    // reverse the string to check whether its palindrome or not
    public static String palindromeTest(String str) {
        // if string length is less than 1
        if (str.length() <= 1) {
            return str;
        }

        // moving it's first character to the end and repeats it recursively
        return palindromeTest(str.substring(1)) + str.charAt(0);
    }

    // main for testing
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      // initiate scanner

        System.out.println("Enter the input: ");
        String testStr = scan.nextLine().trim();           // test string
        String result = palindromeTest(testStr);    // call palindromeTest

        if (testStr.equals(result)) {
            System.out.println(testStr + " reversed is: " + result + " ... It's palindrome!"); // if its palindrome
        } else {
            System.out.println(testStr + " is not palindrome..."); // not a palindrome
        }

        scan.close();                               // close scanner
    }
}
