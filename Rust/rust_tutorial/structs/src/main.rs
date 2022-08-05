struct Person {
    name: String,
    age: u8,
    gender: String,
}

fn main() {
    let mut person_1 = Person {
        name: String::from("Anas Elgarhy"),
        age: 19,
        gender: "Male".to_string(),
    };

    person_1.name = "Anas Ahmed Elgarhy".to_string();

    println!("name: {}\t age: {}\t gender: {}", person_1.name, person_1.age, person_1.gender);

    let rect = Rectangle {
        width: 34,
        height: 7.9,
    };

}

struct Rectangle <T, E> {
    width: T,
    height: E,
}
