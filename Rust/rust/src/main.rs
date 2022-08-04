use rand::Rng;
/// `main` is a function that prints "Hello :D" and a random number between 1 and 100
fn main() {
    let num: u32 = 7;
    println!("Num = {}", num);
    let b: bool = true;
    println!("b = {}", b);

    // To allow changing the value of a variable, we use mut
    let mut c = 8;
    println!("c after change = {}", c);
    c += 1;
    println!("c after change = {}", c);

    // In rust we can use the same name for multiple variables, this is called shadowing
    let num = 7;
    println!("Num now = {}", num);

    // Constants are immutable by default, but we can make them mutable, and we can't shadow them
    const MY_NAME: &str = "Anas";
    // const MY_NAME: &str = "Anas2"; // This will cause an error
    // let MY_NAME = "Anas"; // This will cause an error
    println!("My name is {} :D", MY_NAME);
}