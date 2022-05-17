import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Integer number1,number2;

        System.out.println("Which Mathematical Operation you want to perform");
        System.out.println("Perss 1 to perform Addition");
        System.out.println("Perss 2 to perform Subtraction");
        System.out.println("Perss 3 to perform Multiplcation");
        System.out.println("Perss 4 to perform Division");

        int MathOperation = userInput.nextInt();


        switch (MathOperation) {
            //Addition result
            case 1 -> {
                System.out.println("Please Enter number 1");
                number1 = userInput.nextInt();
                System.out.println("Please Enter number 2");
                number2 = userInput.nextInt();
                if (number1 == 0 || number2 == 0) {
                    System.out.println("Sorry you need to enter both number to perform calculations");
                } else {
                    System.out.println("Here is your Addition result " + number1 + number2);
                }
            }
            //Subtraction result
            case 2 -> {
                System.out.println("Please Enter number 1");
                number1 = userInput.nextInt();
                System.out.println("Please Enter number 2");
                number2 = userInput.nextInt();
                if (number1 == null || number2 == null) {
                    System.out.println("Sorry you need to enter both number to perform calculations");
                } else {
                    int subtractResult = number1 - number2;
                    System.out.println("Here is your Subtraction result " + subtractResult);
                }
            }
            // Multiplication result
            case 3 -> {
                System.out.println("Please Enter number 1");
                number1 = userInput.nextInt();
                System.out.println("Please Enter number 2");
                number2 = userInput.nextInt();
                if (number1 == null || number2 == null) {
                    System.out.println("Sorry you need to enter both number to perform calculations");
                } else {

                    System.out.println("Here is your Multiplication result " + number1 * number2);
                }
            }
            //Division result

            case 4 -> {
                System.out.println("Please Enter number 1");
                number1 = userInput.nextInt();
                System.out.println("Please Enter number 2");
                number2 = userInput.nextInt();
                System.out.println("Here is your Division result " + number1 / number2);
            }
        }

    }
}