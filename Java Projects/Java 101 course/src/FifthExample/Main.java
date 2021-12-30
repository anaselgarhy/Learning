package FifthExample;

public class Main {
    public static void main(String[] args){
        Calc calc = new Calc();
        int[] a = {2, 65, 7, 8};
        int[] b = {22, 5, 2};
        int[] result = calc.multipleArrays(a, b);
        if(result != null)
            // print result
            for(int v : result)
                System.out.println(v);
            else
                System.err.println("result is null");
    }
}
