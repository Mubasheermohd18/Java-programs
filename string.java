import java.util.*;

public class string {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = new String("hello");

        System.out.println(s1==s3); // true
        // Both s1 and s3 refer to the same String literal in the String Pool.

        System.out.println(s1==s2); // false
        // s1 points to the String Pool object, while s2 points to a new object
        // created in Heap memory using the 'new' keyword.

        System.out.println(s3==s4); // false
        // s3 points to the String Pool object, while s4 points to a different
        // Heap object created using 'new'.

        System.out.println(s1.equals(s2)); // true
        // equals() compares the actual contents of the strings.
        // Both s1 and s2 contain "hello", so it returns true.

       System.out.println(s2.equals(s4)); // true
        // Both s2 and s4 contain the same text "hello".
        // equals() checks content, not memory location.

        System.out.println(s1.equals(s3)); // true
        // s1 and s3 contain the same string "hello".
        // Therefore equals() returns true.
    }
}