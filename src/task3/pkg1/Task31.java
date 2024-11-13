/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3.pkg1;
import java.util.Scanner;
/**
 *
 * @author 2277120
 */
public class Task31 {


    public double calcResult(double num1, double num2) {
        return num1 + num2;
    }

    public double calcResult(double num1, double num2, char oper) {
        switch (oper) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            default:
                System.out.println("Error: Invalid operator");
                return 0;
        }
    }

    public double calcResult(String formula) {
        String[] parts = formula.split(" ");
        double num1 = Double.parseDouble(parts[0]);
        char oper = parts[1].charAt(0);
        double num2 = Double.parseDouble(parts[2]);
        return calcResult(num1, num2, oper);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task31 calculator = new Task31();

        System.out.print("Please enter two numbers, separated by space: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.print("Please enter the operator (+, -, *, or /): ");
        char oper = scanner.next().charAt(0);

        System.out.print("Please enter a formula, e.g., \"3.14 * 2\": ");
        scanner.nextLine(); 
        String formula = scanner.nextLine();

        System.out.println("\nCalling the first method : " + num1 + " + " + num2 + " = " + String.format("%.2f", calculator.calcResult(num1, num2)));
        System.out.println("Calling the second method : " + num1 + " " + oper + " " + num2 + " = " + String.format("%.2f", calculator.calcResult(num1, num2, oper)));
        System.out.println("Calling the third method : " + formula + " = " + String.format("%.2f", calculator.calcResult(formula)));
        
    }
}
