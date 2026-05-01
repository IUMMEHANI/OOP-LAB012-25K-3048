package Exceptions;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        String num = s.nextLine();
        try{
            if(num == null || num.trim().isEmpty()){
                System.out.println("This is emptyy or null.");
            }
            int n;
            try {
                n = Integer.parseInt(num);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Not a valid integer.");
            }
            if (n < 0) {
                throw new IllegalArgumentException("Factorial of negative number is not defined.");
            }
            int factorial = 1;
            for(int i = 1 ; i <= n ; i++) {
                if (Integer.MAX_VALUE / i < factorial){
                    throw new ArithmeticException("Overflow of int.");
                }
                factorial= factorial*i;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }  catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        s.close();
    }
}
