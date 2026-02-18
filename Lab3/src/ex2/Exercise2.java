package ex2;

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
        String testStr = "hello";
        String result = palindromeTest(testStr);

        System.out.println(testStr + " After: "+ result);
    }
}
