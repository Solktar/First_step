import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int k = 3;
        int[][] mat = new int[a][b];
        Scanner sc = new Scanner(System.in);
        for (int c = 0; c < mat.length; c++) {
            for (int d = 0; d < mat[c].length; d++) {
                System.out.print("Введите элемент матрицы [" + c + "][" + d + "]:");
                mat[c][d] = sc.nextInt();
            }
        }
        System.out.println("Теперь произведём вывод первой строки матрицы на экран, где каждый элемент умножается на 3:");
        for (int e = 0; e < 1; e++) {
            for (int f = 0; f < b; f++) {
                System.out.println(mat[e][f] * k + " ");
            }
        }
    }
}