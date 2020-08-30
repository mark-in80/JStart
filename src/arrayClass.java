public class arrayClass {
    public static void main (String[] args) {
        char[][] array = new char[3][3];
        for (int i = 0; i < args.length; i++)
            array[i] = new char[3];
        array [0][0] = 'H';
        array [0][1] = 'I';
        array [1][0] = '!';
        System.out.print(array[0][0]);
        System.out.print(array[0][1]);
        System.out.print(array[1][0]);
    }
}
