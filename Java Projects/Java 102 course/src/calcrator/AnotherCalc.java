package calcrator;

public class AnotherCalc extends SimpleCalc {
    /**
     * num1 and num2 equal zero
     */
    public AnotherCalc(){
        super();
    }
    public AnotherCalc(double num1, double num2){
        super(num1, num2);
    }
    public double mul(){
        return getNum1() * getNum2();
    }
    public double div(){
        if(getNum2() == 0.0)
            return 0.0;
        return getNum1() / getNum2();
    }
}
