
public class ConditionalStatement {

    public static void main(String[] args) {
        int myAge = 15;
        if (myAge > 20) {
            System.out.println("Нет, не верно");
        }

        boolean isMen = true;
        if (isMen) {
            System.out.println("Да");
        }

        if (!isMen) {
            System.out.println("Нет");
        }

        double myHeight = 1.81;
        if (myHeight < 1.80) {
            System.out.println("Нет, не верно");
        } else {
            System.out.println("Да, верно");
        }
        char firstLetterOfName = 'Д';
        if (firstLetterOfName == 'M') {
            System.out.println("Нет");
        } else if (firstLetterOfName == 'И') {
            System.out.println("Нет");
        } else {
            System.out.println(".");
        }
    }
}