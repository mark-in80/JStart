package Inter;

public class array implements InterClass {
    int a[] = new int[20];
    int b = 0;

    @Override
    public int get(int i) {
        return a[i];

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
