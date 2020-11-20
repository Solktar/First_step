import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Final_Task_1 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите число в бинарном формате: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char[] c = S.toCharArray();
        int l = c.length;
        for (int i3 = 0; i3 < c.length;) {
            if (c[i3] == ' ') {
                l = l - 1;
                i3++;
            } else {
                i3++;
            }
        }
        int[] a = new int[l];
        int i1 = 0;
        for (int i = 0; i < c.length; ) {
            if (c[i] == ' ') {
                i++;
            } else {
                a[i1] = Character.getNumericValue(c[i]);
                i++;
                i1++;
            }
        }
        int mn = 1;
        int itog = 0;
        for (int i4 = a.length - 1; i4 >= 0; i4--) {
            itog = a[i4] * mn + itog;
            mn = mn * 2;
        }
        System.out.println("Ваше число в десятичном формате: " + itog);
    }
}