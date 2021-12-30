package FourthExample;

public class StrOp {
    private String str;
    public StrOp(String str){
        this.str = str;
    }
    public char[] toCharArray(){
        char[] array = new char[str.length()];
        for(int i=0; i<str.length(); i++)
            array[i] = str.charAt(i);
        return array;
    }
}
