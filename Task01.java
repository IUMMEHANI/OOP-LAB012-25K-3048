package Exceptions;

public class Task01 {
    public static void main(String[] args) {
        String[] array = {"34", "56", "0", "abc", "90"};//using string so no error for having numbers and characters both in a same array
        try {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Error: The list is null or empty.");
            }
            int sum = 0;
            int count = 0;
            for (String number : array){
                try {
                    int num = Integer.parseInt(number); //converting strings numbers to int numbers
                    sum += num;
                    count++;
                } catch (NumberFormatException e) {
                    // Skip invalid characters
                    System.out.println("Skipping invalid value: " + number);//probably abc because it is string already
                }
            }
            if (count == 0) {
                System.out.println("Error: No valid integers found in the list.");
            } else {
                double average = (double) sum / count;
                System.out.println("Average of valid integers: " + average);
            }
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}