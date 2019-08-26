
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        String operation = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Введи первое целое число :");
        int x = input.nextInt();

        do {
            System.out.print("\nВведи знак операции :");
            operation = input.next();
        } while (!operation.matches("[+,--/,^,%,*]"));

        System.out.print("\nВведи второе целое число :");
        int y = input.nextInt();

        if (operation.equals("+")) {
            System.out.println("\nОтвет :" + (x + y));
        } else if (operation.equals("-")) {
            System.out.println("\nОтвет :" + (x - y));
        } else if (operation.equals("*")) {
            System.out.println("\nОтвет :" + (x * y));
        } else if (operation.equals("/")) {
            System.out.println("\nОтвет :" + (x / y));
        } else if (operation.equals("%")) {
            System.out.println("\nОтвет :" + (x % y));
        } else if (operation.equals("^")) {

            System.out.println("Ответ :" + (int) Math.pow(x, y));
        }
    }
}