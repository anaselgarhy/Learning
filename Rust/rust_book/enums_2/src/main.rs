enum Coin {
    Penny,
    Nickel,
    Dime,
    Quarter,
}
fn main() {
    println!("{}", value_in_cents(Coin::Quarter));

    let coin = UsCoin::Quarter(UsState::Alaska);
    println!("{}", coin.value_in_cents());

    // Matching with Option<T>
    let yo = get_yo();
    match yo {
        Some(str) => println!("{}", str),
        None => println!("yuk"),
    };

    // Matches Are Exhaustive
    
    // Catch-all Patterns and the `_` Placeholder
    // The `_` placeholder is used to catch any value that doesn't match any of the other patterns.
    // And we have `other` same as `_` but we using if we want to use the value
    let dice_roll = 9;
    match dice_roll {
        3 => println!("You rolled a 3!"),
        7 => println!("You rolled a 7!"),
        other => println!("You rolled a {}!", other), // same as _
    }

    // Rust also has a pattern we can use when we want a catch-all but don't want to use the value in the catch-all pattern.
    // The `_` is a special pattern that matches any value and dose not bind to that value.
    // This tells Rust we aren't going to use the value, so Rust won't warn us about unused variable.
    match dice_roll {
        3 => println!("You rolled a 3!"),
        7 => println!("You rolled a 7!"),
        _ => println!("You rolled"),
    }

    // if we don't want make anythig in the `_` pattern we can use the unit tuple `()`
    match dice_roll {
        3 => println!("You rolled a 3!"),
        7 => println!("You rolled a 7!"),
        _ => (),
    }
}

fn value_in_cents(coin: Coin) -> u8 {
    match coin {
        Coin::Penny => 1,
        Coin::Nickel => 5,
        Coin::Dime => 10,
        Coin::Quarter => 25,
    }
}

#[derive(Debug)]
enum UsState {
    Alabama,
    Alaska,
}

enum UsCoin {
    Penny,
    Nickel,
    Dime,
    Quarter(UsState),
}

impl UsCoin {
    fn value_in_cents(&self) -> u8 {
        match self {
            UsCoin::Penny => 1,
            UsCoin::Nickel => 5,
            UsCoin::Dime => 10,
            UsCoin::Quarter(state) => {
                println!("State quarter from {:?}!", state);
                25
            }
        }
    }
}

fn get_yo() -> Option<String> {
    if rand::random() {
        Some(String::from("Yo"))
    } else {
        None
    }
}
