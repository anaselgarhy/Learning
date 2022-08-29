fn main() {
    // The variables in rust are immutable by default.
    // To make them mutable, we need to use the mut keyword.
    let mut x = 5;
    println!("The value of x is: {}", x);
    x = 6;
    println!("The value of x is: {}", x);
    println!("X are mutable var");

    // Constants
    // Constants are immutable.
    // Constants are created with the const keyword.  // Rust naming convention for constants is to  use all-caps, with underscores between words.
    // Must always be annotated with a type.
    const THREE_HOURS_IN_SECONDS: u32 = 60 * 60 * 3;
    println!("Three hours in seconds: {}", THREE_HOURS_IN_SECONDS);
    println!("THREE_HOURS_IN_SECONDS are constants");

    // Shadowing
    // In rust we can use the same variable name for different variables.
    // This is called shadowing.
    let y = 5;
    let y = y + 1; // Shadowing

    {
        let y = y * 2; // Shadowing
        println!("The value of y is: {}", y);
    }
    println!("The value of y is: {}", y);
   
    let spaces = "     "; // The type of spaces is a &str.
    let spaces = spaces.len(); // The type of spaces is usize.
    println!("The value of spaces is: {}", spaces);
}
