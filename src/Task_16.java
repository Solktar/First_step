import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task_16 {
    public static void main(String[] args) {
        String s1;
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\test_read.txt"));
            if ((s1 = br.readLine()) != null) {
                do {
                    System.out.println(s1);
                }
                while ((s1 = br.readLine()) != null);
            } else {
                System.out.print("Файл пуст.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден." + e);
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}