package Class.Casting;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Anas";
        person1.age = 18;
        Mail ahmed = new Mail();
        ahmed.name = "Ahmed";
        ahmed.age = 26;
        ahmed.gender = "Mail";
        Female asmaa = new Female();
        asmaa.name = "Asmaa";
        asmaa.money = 276.87f;

        Person p = ahmed;
        System.out.println(p.name + ' ' + p.age);
        person1 =ahmed;
        Mail m = (Mail) person1; // if write Mail m = person1; error
        m.gender = "Mail";
        System.out.println(m.name + ' ' + m.age + ' ' + m.gender);

    }

}
