fn main() {
    println!("Hello, world!");

    another_function(); // Call another_function
    
    // Call a function and pass the arguments
    print_value(2);

    print_size(20, 'G');

    // Expressions.
    let y = {
        let x = 4;
        x + 1 // Block value
    };
    println!("The value of y is: {}", y);


    // Functions with return values.
    let five = five();
    let six = six();
    println!("{}, {}", five, six);

    println!("5 + 1 = {}", plus_one(5));
}

fn another_function() {
    println!("Another function.");
}

// In function signatures, you must declare the type of each parameter.
fn print_value(x: i32) {
    println!("The value of x is: {}", x);
}

fn print_size(value: i32, unit: char) {
    println!("The size is: {}{}", value, unit);
}

// Functions can return values to the code that  calls them.
// We don't name return values, but we must declare their type after and arrow (->).
fn five() -> i32 {
    5 // without ;
}
// We can use return keyword also
fn six() -> i32 {
    return 6;
}

fn plus_one(num: i32) -> i32 {
    num + 1 // We can use return num + 1;
}
