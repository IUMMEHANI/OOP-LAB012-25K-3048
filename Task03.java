package Exceptions;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        String num1 = s.nextLine();
        System.out.println("Enter number 2: ");
        String num2 = s.nextLine();
        try{
            if(num1 == null || num1.trim().isEmpty() || num2 == null || num2.trim().isEmpty()){
                throw new IllegalArgumentException("Inputs are either null or empty .");
            }
            int n1,n2;
            Double n01,n02;
            try{
                n01 = Double.parseDouble(num1);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Not a valid Number");
            }
            try{
                n02 = Double.parseDouble(num2);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Not a valid Number");
            }
            try{
                n1 = Integer.parseInt(num1);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Not a valid Integer");
            }
            try{
                n2 = Integer.parseInt(num2);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Not a valid Integer");
            }
            int sum = n1+n2; Double summ=n01+n02;
            int division; Double divisionn;
            if( n2 == 0 || n02 == 0){
                throw new ArithmeticException("Division not possible.");
            }
            else {
                divisionn = n01/n02;
                division = n1/n2;
            }
            System.out.println("DIVISION OF INTEGERS: " + division);
            System.out.println("DIVISION OF DOUBLE VALUES: " + divisionn);
            System.out.println("Sum of integers: " + sum );
            System.out.println("Sum of double values" +
                    ": " + summ );

        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }

}
