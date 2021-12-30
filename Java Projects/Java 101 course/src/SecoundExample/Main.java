package SecoundExample;

public class Main {
    public static void main(String[] args){
        Calc calc = new Calc();
        int result = calc.sum(34, 56);
        // print result
        System.out.println("result = " + result);
        
        result = calc.min(34, 56);
        System.out.println("result = " + result);
        
        result = calc.mul(34, 56);
        System.out.println("result = " + result);
        
        result = calc.div(34, 56);
        System.out.println("result = " + result);
    }
}
