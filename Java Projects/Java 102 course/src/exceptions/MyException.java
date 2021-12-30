package exceptions;

class MyException extends Exception{ // Look here
    public MyException(){
        super("the value > 100");
    }
    public MyException(String message){
        super(message);
    }
}
class Main{
    public void function(int value) throws MyException{
        if(value > 100)
            throw new MyException();
        else if(value < 0)
            throw new MyException("the value are negative !");
    }
    public static void main(String[] args){
        try {
            new Main().function(188);
        } catch(MyException ex){
            System.out.println(ex.getMessage());
        }
    }
}