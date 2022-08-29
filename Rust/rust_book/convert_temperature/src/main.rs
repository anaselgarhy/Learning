use std::io; // Import th `io` module from standert lib

fn main() {
    println!("Please enter the temperature: ");

    let mut temperature = String::new();

    // Read the temperature from user as a string
    io::stdin()
        .read_line(&mut temperature)
        .expect("Canot rread the input :(");

    // Convert the string to `u32` (int). and shadowing the `temperature` var
    let temperature: f32 = match temperature
        .trim()
        .parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Please enter a number!");
                return;
            },
        };

    println!("Convert to: ");
    println!("[1] Fahrenheit");
    println!("[2] Celsius");

    let mut choice = String::new();

    io::stdin()
        .read_line(&mut choice)
        .expect("Error!");

    let choice: i8 = match choice
        .trim()
        .parse() {
            Ok(num) => num,
            Err(_) => {
                println!("Please enter a number!");
                return;
            },
        };

    let temperature = match choice {
        1 => (temperature * 1.8) + 32.0,
        2 => (temperature - 32.0) * (5.0 / 9.0),
        _ => {
            println!("Error choice!");
            return;
        },
    };

    println!("The temperature = {}", temperature);
}
