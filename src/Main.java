import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Prvi broj: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Unesite operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Drugi broj:");
        double operand2 = scanner.nextDouble();


        if (operator.equals("+")) {
            System.out.println("Rezultat je: " + (operand1+operand2));
        }
        else if (operator.equals("-")) {
            System.out.println("Rezultat je: " + (operand1-operand2));
        }
        else if (operator.equals ("*")) {
            System.out.println("Rezultat je: " + (operand1*operand2));
        }else if (operator.equals("/")) {
            System.out.println("Rezultat je: " + (operand1 / operand2));
        };






    }
}