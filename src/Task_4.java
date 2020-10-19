import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введи число в бинарном формате.");
        String a = in.nextLine();
        int b = Integer.parseInt(a, 2);
        System.out.println("Перевёл число в десятичный формат: " + b);

    }
}