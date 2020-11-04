import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите размер числового массива: ");
        int a = sc.nextInt();
        int[] m = new int[a];
        for (int i = 0; i < m.length; i++) {
            System.out.print("Введите значение массива №" + i + ": ");
            m[i] = sc.nextInt();
        }
        for (int s = a - 1; s > 0; s--) {
            for (int s1 = 0; s1 < s; s1++) {
                if (m[s1] > m[s1 + 1]) {
                    int t = m[s1];
                    m[s1] = m[s1 + 1];
                    m[s1 + 1] = t;
                }
            }
        }
        System.out.println("Массив отсортирован.");
        int b;
        for (b = 0; b < m.length; b++) {
            System.out.println("Элемент массива[" + b + "]: " + m[b]);
        }
    }
}