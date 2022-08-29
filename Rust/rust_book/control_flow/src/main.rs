f​Well then I'll cya later￼​Well then I'll cya later￼n main() {
    // An `if` expression allows you to branch your code depending on conditions.

    let number = 7;

    if number < 5 {
        println!("condition was true");
    } else {
        println!("condition was false");
    }


    // The condition must be a bool
    // Unlike languages such as Ruby and JavaScript, Rust will not automatically try to convert non-Boolean types to a Boolean.
    // You must be explicit and always provide if with a Boolean as its condition.

    let number = 3; // Shadoing
    
    if number != 0 {
        println!("Number  was something other then zero.");
    } 

    /// Handling Multiple Conditions with `else if`

    let number = 6; // Shadoing

    if number % 4 == 0 {
        println!("Tne number is divisible by 4");
    } else if number % 3 == 0 {
        println!("Tthe number is divisible by 3");
    } else if number % 2 == 0 {
        println!("The number is divisible by 2");
    } else {
        println!("The number is not divisible by 4, 3, or 2");
    }
    
    // Using too many `else if` expressions can clutter your code, so if you have more then one, you might want to refactor your code.

    /// We can use `if` expression with `let` statment, because if expression can be return value :D

    let condition = true;
    let num = if condition { 5 } else { 6 };

    println!("The value of num is: {}", num);

    // The values that have the potential to be results from each arm of `if` must be the same type.

    // let num = if condition { 5 } else { "six" }; // Error, not compile

    println!("Hi :D");
}
