import java.util.Scanner;

public class Final_Task_3 {
    public static void main(String[] args) {
        System.out.print("Это конвертер валюты RUB->USD.\nВведите курс, по которому будет происходить конвертация: ");
        Scanner sc = new Scanner(System.in);
        double c= sc.nextDouble();
        System.out.print("Введите колличество рублей, которое будет конвертировано: ");
        double rub= sc.nextDouble();
        double dol = rub/c;
        System.out.printf("По этому курсу вы получите %.2f$", dol);
    }
}
