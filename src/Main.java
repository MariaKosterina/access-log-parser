import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число и нажмите <Enter>:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число и нажмите <Enter>:");
        int secondNumber = new Scanner(System.in).nextInt();
        double quotient = (double)  firstNumber / secondNumber;
        System.out.println("Сумма введенных чисел: " + firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
        System.out.println("Разность введенных чисел: " + firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber));
        System.out.println("Произведение введенных чисел: " + firstNumber + " * " + secondNumber + " = " + (firstNumber*secondNumber));
        System.out.println("Частное введенных чисел: " + firstNumber + " / " + secondNumber + " = " + quotient);
    }
}
