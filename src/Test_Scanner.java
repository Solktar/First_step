import java.util.Scanner;

public class Test_Scanner {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Какой сейчас год?");
        int num = in.nextInt();
        System.out.printf("Уже %d? Как быстро летит время.\n", num);
        System.out.println("Как тебя зовут?");
        in.nextLine();
        String name = in.nextLine();
        System.out.println("А лет тебе сколько?");
        int age = in.nextInt();
        System.out.printf("Ага, %s, %d годиков. Тебе, видимо, совсем нечем заняться, раз ты тут развлекаешь с консолькой. \n", name, age);
    }

}
