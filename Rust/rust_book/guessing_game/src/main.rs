use rand::Rng; // Import the Rng module from the rand crate.
use std::io; // Import the io module from the standard library. 
use std::cmp::Ordering; // Import the Ordering module from the cmp crate.

fn main() {
    println!("Guess the number!");
    // Generate a random number between 1 and 100.
    let secret_number = rand::thread_rng().gen_range(1..101); // We can use 1..=100 also
                                                              //
    loop {

         println!("Please enter your guess.");

         let mut guess = String::new(); // Create a mutable string variable (variables in rust are const by defualt)

         io::stdin()
             .read_line(&mut guess)
             .expect("Failed to read line :("); // Read the line from user and print "Faled..." if filerr

         // In rust we can reuse the same variable name for different types, its cals "shadow"
         let guess: u32 = match guess
             .trim()
             .parse() {
                 Ok(num) => num,
                 Err(_) => continue,
             };

         println!("You guessed: {}", guess);

         // Ordering is a enum that contains the following values:
         // Less, Equal, Greater
         // We can use the match keyword to match the value of the enum.
         //The match keyword is similar to switch in other languages.
         // The string contains the cmp method, which returns an Ordering enum, it takes reference to whatever we want to compare.
         match guess.cmp(&secret_number) {
             Ordering::Less => println!("Too small!"),
             Ordering::Greater => println!("Too big!"),
             Ordering::Equal => {
                 println!("Awesome, you got it!");
                 break; // Break out of the loop.
            }
         }
    }
}
