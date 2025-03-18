public class removeCharacter {

    // Method to skip 'a' from the string
    public static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    // Method to skip the word "apple" from the string
    public static String skipApple(String up) {
        if (up.isEmpty()) {
            return ""; // Base case, return an empty string
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5)); // Skip the word "apple"
        } else {
            return up.charAt(0) + skipApple(up.substring(1)); // Keep the character and proceed
        }
    }

    public static void main(String[] args) {
        String up = "kapil";
        String p = "";

        // Skip 'a' from the string
        skip(p, up);

        // Skip "apple" from the string and print the result
        System.out.println(skipApple("A apple is good"));
    }
}
