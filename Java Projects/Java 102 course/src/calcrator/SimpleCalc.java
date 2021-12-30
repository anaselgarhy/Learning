package calcrator;

public class SimpleCalc {
    private double num1, num2;

    /**
     * num1 = 0 and num2 = 0
     */
    public SimpleCalc(){
        num1 = 0;
        num2 = 0;
    }

    /**
     * this.num1 = num1 and this.num2 = num2
     * @param num1 number one to you want calc
     * @param num2 number tow to you want calc
     */
    public SimpleCalc(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void setNum1(double num1){
        this.num1 = num1;
    }
    public double getNum1(){
        return num1;
    }
    public void setNum2(double num2){
        this.num2 = num2;
    }
    public double getNum2(){
        return num2;
    }
    public double sum(){
        return num1 + num2;
    }
    public double sub(){
        return num1 - num2;
    }
}
