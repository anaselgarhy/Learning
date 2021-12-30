package enumeration;

public class A {
    public static enum GenderX {
        MALE(10, "Male"),
        FEMALE(20, "Female");
        private int num;
        private String value;
        public final int n = 2;
        private GenderX(int num, String value){ // look here
            this.num = num;
            this.value = value;
        }
        public int getNum() {
            return num;
        }
        public String getValue() {
            return value;
        }
    }
}
