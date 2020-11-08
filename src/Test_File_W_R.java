import java.io.*;

public class Test_File_W_R {
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
                //System.out.print("Файл пуст.");
                System.out.print("Файл пуст. Хотите произвести запись в файл? Да/Нет: ");
                BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
                String a = bw.readLine();
                if ((a.equalsIgnoreCase("Да"))) {
                    System.out.println("ОК. Вводите данные. Чтобы завершить ввод и запись данных введите - СТОП.");
                    String w;
                    try (FileWriter fw = new FileWriter("D:\\test_read.txt")) {
                        do {
                            System.out.print(":");
                            w = bw.readLine();
                            if (w.equals("СТОП")) break;
                            w = w + "\n";
                            fw.write(w);
                        }
                        while (!w.equals("СТОП"));
                    } catch (IOException e) {
                        System.out.println("Ошибка: " + e);
                    }
                } else if ((a.equalsIgnoreCase("Нет"))) {
                    System.out.println("Нет, так нет");
                } else {
                    System.out.println("Что-то не то вы ввели.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("А файл-то где?\n" + e);
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}