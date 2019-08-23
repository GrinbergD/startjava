package Lesson1;


public class ConditionalStatement {

    public static void main(String[] args) {

        int MyYears = 15;
        if (MyYears > 20) {
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

        double MySize = 1.81;

        if (MySize < 1.80) {
            System.out.println("Нет, не верно");
        } else {
            System.out.println("Да, верно");
        }

        char MyName = 'Д';

        if (MyName == 'M') {
            System.out.println("Нет");
        } else if (MyName == 'И') {
            System.out.println("No");
        } else {
            System.out.println("Мое имя начинается с другой буквы");
        }
    }

}