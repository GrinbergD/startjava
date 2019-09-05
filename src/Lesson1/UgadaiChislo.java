import java.util.Random;
import java.util.Scanner;

public class UgadaiChislo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 100;
        int number2 = 0;
        int ugadai;
        boolean win = false;
        while (win == false) {
            System.out.print("Введи число: ");
            ugadai = input.nextInt();
            number2++;
            if (ugadai == number1) {
                win = true;
            } else if (ugadai < number1) {
                System.out.println("я загадал число больше");
            } else if (ugadai > number1) {
                System.out.println(" я загадал число меньше");
            }
        }
        System.out.println("Ты угадал число с " + number2 + " попыток!");
    }

}
