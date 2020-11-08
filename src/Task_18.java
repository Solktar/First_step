import java.io.*;

public class Task_18 {
    public static int S_count = 0;
    public static void read() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\test18.txt"));
            String s1 = br.readLine();
            do {
                System.out.println(s1);
                S_count++;
            } while ((s1 = br.readLine()) != null);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден." + e);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }

    public static void write() {
        String s2;
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные для перезаписи данных в файле: ");
        try (FileWriter fw = new FileWriter("D:\\test18.txt")) {
            while (S_count > 0) {
                System.out.print(":");
                s2 = bw.readLine();
                s2 = s2 + "\n";
                fw.write(s2);
                S_count--;
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }

    public static void main(String[] args) {
        Task_18.read();
        Task_18.write();
    }
}