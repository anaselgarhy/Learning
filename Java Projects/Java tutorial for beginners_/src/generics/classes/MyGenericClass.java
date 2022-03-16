package generics.classes;

public class MyGenericClass <Think> {
    private final Think a;

    public MyGenericClass(Think think) {
        a = think;
    }

    public Think getA() {
        return a;
    }
}
