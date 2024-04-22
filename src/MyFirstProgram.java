import java.util.InputMismatchException;
import java.util.Scanner;
public class MyFirstProgram {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);

        try {
            System.out.println("Enter your Score: ");
            int score = object.nextInt();

            if (score >= 0 && score <= 100) {
                if (score >= 75) {
                    System.out.println("A");
                } else if (score >= 65) {
                    System.out.println("B");
                } else if (score >= 55) {
                    System.out.println("C");
                } else {
                    System.out.println("F");
                }
            } else {
                System.out.println("Invalid Score");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Input valid number this is not an integer");
        }
        object.close();
    }

}