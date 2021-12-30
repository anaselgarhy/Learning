package enumeration;

public enum Gender implements MyInterface, MyInterface2 {
    MALE(10, "Male"){
        @Override // Look here
        public void tryInterface2() {
        }
        @Override
        public void print(){
            System.out.println("My gender is " + value);
        }
    },
    FEMALE(20, "Female"){
        @Override // Look here
        public void tryInterface2() {
        }
        @Override
        public void print(){
            System.out.print("My gender : " + value);
        }
    };
    public int num;
    public String value;
    public final int n = 2;
    Gender(int num, String value){ // look here
        this.num = num;
        this.value = value;
    }
    public abstract void print(); // Look here
    @Override
    public void tryInterface(){
    }
}
