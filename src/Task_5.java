import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сейчас таблицу умножения показывать буду.");
        System.out.println("Введи число, от 1 до 10.");
        byte i = sc.nextByte();
       /* if (i<1 || i>10){
            System.out.println("Нет, так не пойдёт.");
        }*/
        if (i>=1 & i<=10){
        System.out.println("Держи: \n" +
                i + "x1=" + i + "\n" +
                i + "x2=" + i * 2 + "\n" +
                i + "x3=" + i * 3 + "\n" +
                i + "x4=" + i * 4 + "\n" +
                i + "x5=" + i * 5 + "\n" +
                i + "x6=" + i * 6 + "\n" +
                i + "x7=" + i * 7 + "\n" +
                i + "x8=" + i * 8 + "\n" +
                i + "x9=" + i * 9 + "\n" +
                i + "x10=" + i * 10 + "\n");}
        else {
            System.out.println("Нет, так не пойдёт.");
        }

    }
}
