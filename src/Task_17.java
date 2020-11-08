import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_17 {
    public static void main(String[] args) {
        String w;
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные для записи в файл. Чтобы завершить ввод и запись данных введите - СТОП.");
        try (FileWriter fw = new FileWriter("D:\\test_write.txt")) {
            do {
                System.out.print(":");
                w = bw.readLine();
                if (w.equalsIgnoreCase("стоп")) break;
                w = w + "\n";
                fw.write(w);
            } while (!w.equalsIgnoreCase("СТОП"));
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}