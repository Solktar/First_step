import java.util.Formatter;

class FormatDemo1 {
    public static void main(String[] args) {
        double x = 1000.0 / 3.0;
        System.out.println("Строка без форматирования: " + x);

        Formatter formatter = new Formatter();
        formatter.format("Строка c форматированием: %.2f%n", x);
        formatter.format("Строка c форматированием: %8.3f%n", x);
        formatter.format("Строка c форматированием: %16.40f%n", x);
        System.out.println(formatter);
        System.out.printf("%.2f", x);
    }
}

public class Other {

    public static void main(String[] args) {
        String data = "name:Igor\nsurname:Kolashnikov\nage:14\ntime:14:55";
//разбиваем строку на несколько подстрок на основании
// встречаемого символа новой строки
        String[] lines = data.split("\n");
//проходим каждую подстроку
        for (String line : lines) {
            //находим индекс первого вхождения символа ":" в подстроке
            int pos = line.indexOf(":");
            //вычленяем имя атрибута из подстроки
            String attributeName = line.substring(0, pos);
            //вычленяем значение атрибута
            String value = line.substring(pos + 1, line.length());
            //вывод на экран вычлененных значений в нужном нам формате.
            System.out.println(attributeName + " - " + value);
        }

       /* int sample[] = new int[10];
        int i;
        for (i = 0; i < 10; i = i + 1) {
            sample[i] = i;
            System.out.println("Элемент sample[" + i + "]: " + sample[i]);
        }
        System.out.println("Всё");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
        }*/
    }
}
/*
while(условие) {
    // тело цикла
}

do
        // тело цикла
        while(условие)
*/
/*
for (int i = 1; i <= 10; i++) {
  System.out.print(i + " ");
}
 */
/*
//Расчет числа кубических дюймов в кубе объемом в 1 куб. милю
            long ci;
            long im;
            im = 5280 * 12;
            ci = im * im * im;
            System.out.println("B одной кубической миле содержится " + ci + " кубических дюймов");
            */
/*        double a = Math.sqrt(3 + 2);

        String FFF = "123";
        int f = Integer.parseInt(FFF);
        System.out.println(f + "\n" + a + "\n");

        if (mouse != 0 && weight / mouse < 1000) {
            mInfoTextView.setText("Можно кормить кота");
            val < 0 ? -val : val;*/
/*        int month = 3;
        String monthString;
        switch (month) {
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            default:
                monthString = "Не знаем такого";
                break;
        }
        System.out.println(monthString);

    }
}*/