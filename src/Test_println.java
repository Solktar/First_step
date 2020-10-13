public class Test_println {
//Коммент

    public static void main(String[] args) {

        int A=1;
        int B=2;
        int C=A+B;
        int D=C*B;
        String name="ПЁС";
        float mass=15.4f;

        System.out.println("Hello, World!");
        /*
        Ещё коммент
        */
        //System.out.print("Ну привет.\n");

        //System.out.println("\n"+"\n");
        System.out.println("\nA = "+A+"\n"+"B = "+B+"\n"+"A + B = "+C+"\n"+"A + B x B = "+D);
        System.out.printf("B = %d, A = %d\n", B, A);
        System.out.printf("\nИмя: %s \nВозраст: %d \nВес: %.1f кг\n", name, D, mass);
    }

}