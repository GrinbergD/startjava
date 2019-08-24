package Lesson1;


public class ConditionalStatement {

    public static void main(String[] args) {
        int myYears = 15;
        if (myYears > 20) {
            System.out.println("Нет, не верно");
        }

        boolean men = true;
        boolean women = true;
        if (men) {

            System.out.println("Yes");
        }

        if (women) {
            System.out.println("No");
        }

        double mySize = 1.81;

        if (mySize < 1.80) {
            System.out.println("Нет, не верно");
        } else {
            System.out.println("Да, верно");
        }

        char myName = 'Д';

        if (myName == 'M') {
            System.out.println("Нет");
        } else if (myName == 'И') {
            System.out.println("No");
        } else {
            System.out.println("Мое имя начинается с другой буквы");
        }
    }

}