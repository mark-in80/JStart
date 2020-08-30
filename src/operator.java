import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        // условные операторы
        Scanner num =  new Scanner(System.in);
        int first, typ;
        System.out.print("Enter ");
        first = num.nextInt();

        if (first == 2 || first == 0) {
            System.out.println("Num = " + first);
        }
        typ = first == 2 ? 2 : 0;
        System.out.print("this is other, Num = 2 ");

        /*
        Оператор switch сравниваевает в кейсе переменную и
        предоставляет дальнейшие операции после
         */
        switch (first) {
            case 51 -> System.out.println("this is other, Num = 51");
            case 55 -> System.out.println("this is other, Num = 55");
            default -> System.out.println("this is other, Num = " + first);
        }

    }
}
