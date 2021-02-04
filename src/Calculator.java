import java.util.*;

public class Calculator {

    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("Dude its a calculator of sorts?\n");

        System.out.print("Pick a number, also read the text.\nRemember you can only choose 1, 2, 3 or 4.\n\n" +
                "1. Multiply\n" +
                "2. Divide\n" +
                "3. Add\n" +
                "4. Subtract\n\n" +
                "Select an operation (1/2/3/4): ");

        int choice;

        try {
            choice = input.nextInt();
        } catch(InputMismatchException e){
            throw new InputMismatchException("Dumbass should have chose 1, 2, 3 or 4!");
        }
        if(choice > 4){
            throw new InputMismatchException("Dumbass should have chose 1, 2, 3 or 4!");
        }
        if(choice < 1){
            throw new NumberFormatException("Dumbass should have chose 1, 2, 3 or 4!");
        }

        switch(choice) {
            case 1: {
                double[] numbers = getInput();
                System.out.println(numbers[0] + " * " + numbers[1] + " = " + multiply(numbers[0], numbers[1]));
                break;
            }
            case 2: {
                double[] numbers = getInput();
                System.out.println(numbers[0] + " / " + numbers[1] + " = " + divide(numbers[0], numbers[1]));
                break;
            }
            case 3: {
                double[] numbers = getInput();
                System.out.println(numbers[0] + " + " + numbers[1] + " = " + add(numbers[0], numbers[1]));
                break;
            }
            case 4: {
                double[] numbers = getInput();
                System.out.println(numbers[0] + " - " + numbers[1] + " = " + subtract(numbers[0], numbers[1]));
                break;
            }
        }
    }

    private static double[] getInput() {
        double[] array = new double[2];

        System.out.print("\nEnter number one: ");
        try {
            array[0] = input.nextDouble();
        } catch (Exception e) {
            throw new InputMismatchException("Don't write letters into a calculator retard");
        }
        if (array[0] < 0) {
            System.out.print("\nSeems like you used a negative number.\nTry again next time!");
            System.exit(0);
        }
        System.out.print("\nEnter number two: ");
        try {
            array[1] = input.nextDouble();
        } catch (Exception e) {
            throw new InputMismatchException("Don't write letters into a calculator retard");
        }
        if (array[1] < 0) {
            System.out.print("\nSeems like you used a negative number.\nTry again next time!");
            System.exit(0);
        }

        return array;
    }
    private static double multiply(double x, double y) {
        return x * y;
    }
    private static double divide(double x, double y) {
        if(y == 0) {
            throw new ArithmeticException("Divided by zero");
        } else {
            return x / y;
        }
    }
    private static double add(double x, double y) {
        return x + y;
    }
    private static double subtract(double x, double y) {
        return x - y;
    }

}