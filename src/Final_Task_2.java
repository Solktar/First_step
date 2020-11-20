import java.util.Scanner;

public class Final_Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите размер числового массива: ");
        int a = sc.nextInt();
        int[] m = new int[a];
        for (int i = 0; i < m.length; i++) {
            System.out.print("Введите значение массива №" + i + ": ");
            m[i] = sc.nextInt();
        }
        int[] v = new Final_Task_2().pSort(m);
        System.out.println("Массив отсортирован.");
        for (int c = 0; c < v.length; c++) {
            System.out.println("Элемент массива[" + c + "]: " + m[c]);
        }
    }

    public int[] pSort(int[] m) {
        int temp, b;
        for (int i = 0; i < m.length - 1; i++) {
            if (m[i] > m[i + 1]) {
                temp = m[i + 1];
                m[i + 1] = m[i];
                b = i;
                while (b > 0 && temp < m[b - 1]) {
                    m[b] = m[b - 1];
                    b--;
                }
                m[b] = temp;
            }
        }
        return m;
    }
}
