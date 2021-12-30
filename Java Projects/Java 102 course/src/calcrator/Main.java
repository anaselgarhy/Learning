package calcrator;

public class Main {
    public static void main(String[] args){
        SimpleCalc sCalc = new SimpleCalc(16, 5);
        System.out.println("sum = " + sCalc.sum());
        System.out.println("sub = " + sCalc.sub());

        AnotherCalc aCalc = new AnotherCalc();
        aCalc.setNum1(30.87);
        aCalc.setNum2(28.7);
        System.out.println("mul = " + aCalc.mul());
        System.out.println("div = " + aCalc.div());
    }
}
