
import java.util.Scanner;
public class CSJava {
    public static void main(String[] arg){
         Scanner scr = new Scanner(System.in);
         int first, second, result;
         System.out.print("Введи че нибудь: ");
         first = scr.nextInt();
         System.out.print("Введи че нибудь: ");
         second = scr.nextInt();
         result = first + second;
         System.out.print("Result " + result );

    }
}
