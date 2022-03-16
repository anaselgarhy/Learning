package innerclasses;

public class OuterClass {
    private int num;

    public OuterClass() {
        num = -1; // As start value
    }

    public int getNum() {
        return num;
    }

    public class InnerClass {
        private int b;

        public InnerClass() {
            b = 100;
        }

        public int getB() {
            return b;
        }
    }
}
