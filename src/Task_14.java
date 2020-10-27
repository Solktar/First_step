import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        try {
            int X = Integer.parseInt(S);
            double Y = X;
            System.out.printf("Вывод: %n%S%n%d%n%.10f%n", S, X, Y);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
}