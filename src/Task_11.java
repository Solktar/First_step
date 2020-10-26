import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Что-нибудь введите.");
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        System.out.println("Вы ввели: ".concat(A));
    }
}
