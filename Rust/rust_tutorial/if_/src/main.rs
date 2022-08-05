use std::io;

fn main() {
    let mut age = String::new();

    println!("How old are you?");

    io::stdin().read_line(&mut age).expect("Can't read the age.");
    
    let age: u8 = age.trim().parse().expect("Please type a valid age.");

    let can_vote = if age >= 18 {
        "You can vote."       
    } else {
        "You can't vote."
    };

    println!("{}", can_vote);
}
