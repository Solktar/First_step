import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReader {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введи что-нибудь.");
        String QQY = reader.readLine();
        //System.out.println("Привет".concat(QQY));
        System.out.printf("fff %s\n", QQY);
        System.out.println("Привет\n".concat(String.valueOf(1 + 500)) + " НЕ ".concat(String.valueOf(200 / 2)));
        String FFG="100";
        int num = Integer.parseInt(FFG); //Распарсить строку в число
        //try catch Загуглить
        System.out.println(num+1);
    }

}