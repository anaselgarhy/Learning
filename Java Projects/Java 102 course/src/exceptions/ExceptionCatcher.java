package exceptions;
public class ExceptionCatcher {
    public static void function(int num1, int num2){
        try{
            if(num2 == 0)
                throw new Exception("Can't divide " + num1 + " by zero !");
            else
                System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args){
        function(4, 0);
    }
}
