use std::collections::HashMap;

fn main() {
    let mut heros = HashMap::new();

    heros.insert("Batman", "Bruce Wayne");
    heros.insert("Superman", "Clark Kent");
    heros.insert("Flash", "Barry Allen");

    println!("{:?}", heros);

    for (key, value) in heros.iter() {
        println!("{} is {}", key, value);
    }

    if heros.contains_key("Batman") {
        println!("{} is a hero", heros["Batman"]);
        println!("The joker is a {} villain", heros["Batman"]);
    }

    let su = "Superman";

    match heros.get(su) {
        Some(name) => println!("{} is a {} yooo!", su, name),
        None => println!("{} is not a hero", su),
    };

    // or:
    if heros.get(su).is_some() {
        println!("{} is a {} yooo!", su, heros[su]);
    } else {
        println!("{} is not a hero", su);
    }
}
