import java.util.Scanner;

public class Task_7 {
    public static int X = 33;
    public static int Y = 44;
    public static int Z = 55;

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }

/*        switch (number) {
            case X:
            case Y:
            case Z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;
        }
*/
    }
}