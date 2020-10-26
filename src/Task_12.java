import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.println("Введите строку с пробелами.");
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String[] B = A.split(" ");
        System.out.print("Строка без пробелов: ");
        /*
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
        }
        System.out.println();
        */
        for (String C : B) {
            System.out.print(C);
        }
        System.out.println();
    }
}