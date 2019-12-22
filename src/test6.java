import java.util.Scanner;

public class test6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = in.nextInt();
        System.out.print("Введите второе число: ");
        int y = in.nextInt();
        System.out.print("Введите третье число: ");
        int z = in.nextInt();
        int a  = ((x+y+z)/3) / 2 ;
        System.out.println("Сре́днее арифмети́ческое " + (x+y+z)/3);
        System.out.println(a);
        if (a>3) {
            System.out.print("Программа выполнена корректно" );
        }
    }
}