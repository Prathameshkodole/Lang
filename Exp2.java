public class Exp2 {
    public static void main(String[] args) {
        // Sample strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "   Hello World   ";
        String str4 = "hello world";

        System.out.println("String Operations:");

        // 1. Concatenation
        System.out.println("\n1. Concatenation:");
        System.out.println("str1 + str2: " + str1 + str2); // Using + operator
        System.out.println("str1.concat(str2): " + str1.concat(str2)); // Using concat() method

        // 2. Length
        System.out.println("\n2. Length:");
        System.out.println("str1.length(): " + str1.length());

        // 3. Case Conversion
        System.out.println("\n3. Case Conversion:");
        System.out.println("str1.toUpperCase(): " + str1.toUpperCase());
        System.out.println("str1.toLowerCase(): " + str1.toLowerCase());

        // 4. Trimming
        System.out.println("\n4. Trimming:");
        System.out.println("str3: \"" + str3 + "\"");
        System.out.println("str3.trim(): \"" + str3.trim() + "\""); // Remove leading and trailing spaces

        // 5. Substring
        System.out.println("\n5. Substring:");
        System.out.println("str1.substring(2): " + str1.substring(2)); // Get substring from index 2
        System.out.println("str1.substring(1, 4): " + str1.substring(1, 4)); // Get substring from index 1 to 3

        // 6. Character at Index
        System.out.println("\n6. Character at Index:");
        System.out.println("str1.charAt(0): " + str1.charAt(0)); // Get the character at index 0

        // 7. String Comparison
        System.out.println("\n7. String Comparison:");
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // Case-sensitive comparison
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // Case-insensitive
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));       //Lexicographical comparison
        System.out.println("str1.compareToIgnoreCase(str4): " + str1.compareToIgnoreCase(str4)); // Lexicographical and Case-insensitive

        // 8. Checking if a String Contains another String
        System.out.println("\n8. Checking if a String Contains another String:");
        System.out.println("str1.contains(\"ell\"): " + str1.contains("ell"));

        // 9. Replacing characters
        System.out.println("\n9. Replacing characters:");
        System.out.println("str1.replace('l', 'p'): " + str1.replace('l', 'p'));

        // 10. Splitting a string
        String str5 = "apple,banana,orange";
        System.out.println("\n10. Splitting a string:");
        String[] fruits = str5.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 11. Checking if a string starts or ends with a specific string
        System.out.println("\n11. startsWith() and endsWith():");
        System.out.println("str1.startsWith(\"He\"): " + str1.startsWith("He"));
        System.out.println("str1.endsWith(\"lo\"): " + str1.endsWith("lo"));

        // 12. Checking if the string is empty
        String str6 = "";
        String str7 = " "; //not empty because it has a space
        System.out.println("\n12. isEmpty():");
        System.out.println("str6.isEmpty(): " + str6.isEmpty());
        System.out.println("str7.isEmpty(): " + str7.isEmpty());
    }
}
