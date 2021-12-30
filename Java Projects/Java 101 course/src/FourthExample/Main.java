package FourthExample;

public class Main {
    public static void main(String[] args){
        StrOp str = new StrOp("Anas Ahmed");
        char[] ch = str.toCharArray();
        for (char c : ch)
            System.out.println(c);
    }
}
