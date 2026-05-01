package Exceptions;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter a sentence: ");
            String input = s.nextLine();
            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: Input is null or empty.");
            }
            String[] words = input.trim().split("\\s+");
            if (words.length < 2) {
                throw new IllegalArgumentException("Error: Sentence must contain at least two words.");
            }
            StringBuilder modified = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                modified.append(words[i]).append(" ");
            }
            System.out.println("Your sentence: " + modified.toString().trim());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        s.close();
    }
}