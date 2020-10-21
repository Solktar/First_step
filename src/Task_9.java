import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        int mass[] = new int[3];
        int k = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Последовательно введите 3 числа для записи в массив:");
        mass[0] = sc.nextInt();
        mass[1] = sc.nextInt();
        mass[2] = sc.nextInt();
        //System.out.println("Теперь каждый элемент массива умножим на 2:\n" + mass[0] * 2 + "\n" + mass[1] * 2 + "\n" + mass[2] * 2);
        System.out.println("Теперь каждый элемент массива умножим на " + k + ":");
        for (int i = 0; i < mass.length; ++i) {
            mass[i] = mass[i] * k;
            System.out.println(mass[i]);
        }


    }
}
