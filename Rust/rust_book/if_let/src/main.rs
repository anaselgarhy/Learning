fn main() {
    // Concise Control Flow with `if let`
    // The `if let` syntax lets you combine `if` and `let` into a less verbose way to handle values
    // that match one pattern while ignoring the rest.
    // The syntax `if let` takes a pattern and an  expression separated by an equal sign `=`
    let config_max = Some(3u8);
    if let Some(max) = config_max {
        println!("The maxmimum is configured to be {}", max);
    }
    // same as 
    match config_max {
        Some(max) => println!("The maxmimum is configured to be {}", max),
        _ => (),
    }

    // Using `if let` means less typing, less indentation, and less boilorplate code.

    // We can include an `else` with an `if let`. 
    let x = 4;
    if let 5 = x {
        println!("x is five!");
    } else {
        println!("x is not five!");
    }


    // If you have a situation in witch your program has logic that is too verbose to express using
    // a `match`, rememeber that `if let` is in your Rust toolbox as well.


}
