package final1.FirstExample;

public class Cl {
    private static final float pi = 3.14f;
    private final float oc;
    public Cl(float oc){
        this.oc = oc;
    }
    public float calc(){
        // (2 * pi) + oc
        return (2 * pi) + oc;
    }
}
