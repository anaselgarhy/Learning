// in rust we can use the `fn` keyword to define a function.
// The `fn` keyword is followed by the name of the function,
// followed by parentheses, followed by the parameter list,
// The parameter list is separated by commas and represents the types of the arguments that the function takes.
// (optional) followed by a `->` followed by the return type.
// if a function doesn't return a value, it's return type is `()` (unit), also called empty tuple.

/// The main function is a special function that is called when the program is run.
fn main() {
    let name = my_name();
    println!("My name is: {}", name);

    println!("The last character of my name is: {}", last_char(name));

}

// The last line of a function is a return statement.
// or we can use the `return` keyword.
fn my_name() -> String {
    "Anas".to_string() // no ;
}

fn last_char(str: String) -> char {
    if str.is_empty() {
        return '⛔';
    }
    str.chars().last().unwrap()
}