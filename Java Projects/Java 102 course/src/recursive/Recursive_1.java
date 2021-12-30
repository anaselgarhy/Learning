package recursive;

public class Recursive_1 {
    public void draw(int a){
        if(a == 0)
            return;
        for(int i=0; i<a; i++)
            System.out.print('.');
        System.out.println();
        draw(a - 1);
    }
    public static void main(String[] args){
        new Recursive_1().draw(10);
    }
}
