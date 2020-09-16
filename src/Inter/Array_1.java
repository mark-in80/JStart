package Inter;

public class Array_1 implements InterClass {
    int a[] = new int[20];
    int b = 0;

    @Override
    public int get(int i) {
        if (i < a.length){
            return a[a.length - i - 2];
        }
        else
            return a[0];

    }
    @Override
    public boolean add(int value) {
        if (b != a.length){
            a[b] = value;
            b++;
            return true;
        }
        else
            return false;
    }
}
