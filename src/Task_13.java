import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String s1 = sc.nextLine();
        System.out.print("Введите вторую строку: ");
        String s2 = sc.nextLine();
        int i1, i2;
        i1 = s1.length();
        i2 = s2.length();
        if (i1 > i2) {
            System.out.println("Первая строка длиннее: ".concat(s1));
        } else if (i2 > i1) {
            System.out.println("Вторая строка длиннее: ".concat(s2));
        } else {
            System.out.println("Введённые строки имеют одинаковую длинну");
        }
    }
}