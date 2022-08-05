use std::io::stdin;

fn main() {
    let mut age = String::new();

    stdin()
        .read_line(&mut age)
        .expect("Failed to read the line!");

    let age: u8 = match age
        .trim()
        .parse() {
            Ok(num) => num,
            Err(e) => panic!("Error: {}", e),
        };

    println!("{}", match age {
        1..=18 => "Importent birthday", // 1..=18 is the range operator, means 1 <= age <= 18
        21 | 50 => "yooooooooo", // 21 or 50
        65..=u8::MAX => "you are old yo", // 65..u8::MAX is the range operator, means 65 <= age <= u8::MAX
        _ => "you are not old enough", // _ is the wildcard operator, means anything else
    });
}
