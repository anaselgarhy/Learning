package casting;

public class Main {
    private void print(MyInterface i){
        if(i instanceof App){
            // ((App)i).dummy();
            App app = (App)i; // down casting // Look here
            app.dummy();
        }
    }
    public static void main(String[] args){
        new Main().print(new App());
    }
}
