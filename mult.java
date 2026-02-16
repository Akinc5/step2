import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1, num2, result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();

        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result) ;
        sc.close();
    }
}