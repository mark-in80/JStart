package OOP;

public class MainPolymorph {
    public static void main(String[] args){
        PolymorphShape[] arr =
                new PolymorphShape[] {new PolymorphCircle(),
                        new PolymorphSquare()};
        for (PolymorphShape polymorphShape : arr) polymorphShape.draw();
    }
}
