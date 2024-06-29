package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
/*


Project : Basic Calculator

 */
public class Calculator {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        double number1, number2;
        int operation;

        for (; ; ) {
            try {


                System.out.println("Enter your first value");
                number1 = teclado.nextDouble();
                System.out.println("Enter your second value");
                number2 = teclado.nextDouble();
                System.out.println("Which operation would you like to do?\n press a number\n" + "1- Adittion.\n" + "2-Substraction.\n" + "3-Division.\n" + "4-Multiplication.\n" + "5-Module.\n");
                operation = teclado.nextInt();


                switch (operation) {

                    case 1:
                        double addition = number1 + number2;
                        System.out.println("The result of your operation is: " + " " + addition);
                        break;
                    case 2:
                        double substraction = number1 - number2;
                        System.out.println("The result of your operation is: " + " " + substraction);
                        break;
                    case 3:
                        double division = number1 / number2;
                        if (number2 != 0) {

                            System.out.println("Your result of your operation is: " + division);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    case 4:
                        double multiplication = number1 * number2;
                        System.out.println("The result of your operation is: " + " " + multiplication);
                        break;

                    case 5:
                        double module = number1 % number2;
                        System.out.println("The result of your operation is: " + " " + module);
                        break;
                    default:

                }


            } catch (InputMismatchException e) {
                System.out.println("Error: You must enter an interger.");
                teclado.next();
            }
        }
    }
}






