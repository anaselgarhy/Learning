package Class.NestedClass;

public class Main {
    static class Vachel {
        public String model;
        public double speed;
    }
    static class Car extends Vachel{
        public Car(String model, double speed) {
            this.model = model;
            this.speed = speed;
        }
        }
        static class Person{
            public String name;
            public int age;
            public Person(String name, int age){
                this.name = name;
                this.age = age;
            }
        }
    public static void main(String[] args){
        Car car = new Car("BMW", 2116.9);
        Person person = new Person("Anas", 18);

    }
}
