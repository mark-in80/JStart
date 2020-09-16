/*
this is file have exe overload method
 */

public class Overload {
    public static int summ(int a, int b) {
        return a + b;
    }

    public static int summ(int a, int b, int c){
        return a + b + c;
    }

    public static float summ(float a, float b, float c){
        return a + b + c;
    }

    public static void main(String[] args){
        System.out.println(summ(4, 5));
        System.out.println(summ(4, 5, 6));
        System.out.println(summ(4.5f, 5.4f, 3.4f));
    }

}
