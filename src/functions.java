import java.util.Scanner;

public class functions {

    public static void main(String[] args) {
        func(3,4);
    }
    public static int[] readArray(){
        int [] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr [i] = in.nextInt();
        return arr;
    }

    public static int func (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i ++)
            result *= a;
        System.out.println(result);
        return result;
    }
}
