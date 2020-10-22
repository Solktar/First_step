import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размер массива:");
        int a = sc.nextInt();
        int mass[] = new int[a];
        int k = 2;
        System.out.println("Размер массива: " + a);
        for (int b = 0; b < mass.length; ++b) {
            System.out.println("Введите значение массива №" + b);
            mass[b] = sc.nextInt();
        }
        System.out.println("Теперь каждый элемент массива умножим на " + k + ":");
        for (int i = 0; i < mass.length; ++i) {
            mass[i] = mass[i] * k;
            System.out.println(mass[i]);
        }
    }
}
