/*Scrivere una funzione che controlli se un numero int è in un 
determinato range. Se lo, è ritorna true ; se non lo è, lancia 
un'eccezione.*/

public class Main {

    public static void main(String[] args) {
        try {
            int number = 11;
            int minimum = 0;
            int maximum = 10;

            if (isInRange(number, minimum, maximum)) {
                System.out.println("The number is in range!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            // getMessage() serve a nascondere la dicitura java.lang.ArithmeticException:
        }
    }

    public static boolean isInRange(int number, int minimum, int maximum) {
        if (number < minimum || number > maximum) {
            throw new ArithmeticException("The number is out of bounds.\nTry with a number between 0 and 10!");
        }
        return true;
    }
}