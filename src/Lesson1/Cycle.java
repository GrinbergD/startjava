
public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int g = -6;
        int counter;
        while (g < 8) {

            System.out.println(g);
            g += 2;
        }
        int h = 10;
        int i = 2;
        do{

            if (h % 2 ==0) {
                System.out.println(" ");
            }else{
                System.out.println(h);
            }h++;


        } while (h<=20);

    }
}