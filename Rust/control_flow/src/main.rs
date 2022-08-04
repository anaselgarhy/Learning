fn main() {
    if 1 == 2 {
        println!("Math is broken");
    } else {
        println!("Math is fine");
    }

    // Unlike most languages, if in rust can be used as a statement, means if can be return value

    let x = if true {
        5
    } else {
        6 // Don't use return keyword in if statement
    };

    println!("The value of x = {}", x);

    // if else
    let number = 8;

    if number % 4 == 0 {
        println!("Number is divisible by 4");
    } else if number % 3 == 0 {
        println!("Number is divisible by 3");
    } else if number % 2 == 0 {
        println!("Number is divisible by 2");
    } else {
        println!("Number is not divisible by 4, 3, or 2");
    }

    // Match
    // Match is like switch in other languages
    let b = true;

    let binary = match b {
        true => 1,
        false => 0
    };

    println!("binary = {}", binary);

    let d = Direction::Down;

    // _ means match any else, default in other languages
    match d {
        Direction::Up => println!("Uppp ⬆⬆"),
        Direction::Down => println!("Down ⬇⬇"),
        _ => println!("Something else")
    }
}

enum Direction {
    Up,
    Down,
    Left,
    Right
}