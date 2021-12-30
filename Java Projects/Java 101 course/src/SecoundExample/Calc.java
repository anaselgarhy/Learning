package SecoundExample;

public class Calc {
    public int sum(int num1, int num2){
        return num1 + num2;
    }
    public int min(int num1, int num2){
        return num1 - num2;
    }
    public int mul(int num1, int num2){
        return num1 * num2;
    }
    public int div(int num1, int num2){
        if(num2 == 0)
            return 0;
        return num1 / num2;
    }
}
