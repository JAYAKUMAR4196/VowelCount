public class VowelCount {
    public static void main(String[] args) {
        // Sample input string
        String input = "Hello, how are you?";

        // Convert the string to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Initialize a counter for vowels
        int vowelCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel (a, e, i, o, u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Output the result
        System.out.println("Number of vowels: " + vowelCount);
    }
}
