#[allow(unused)] // this is for devolopment

use std::io;
use rand::Rng;

fn main() {
    println!("Enter your name: ");
    let mut name = String::new();
    let greeting = "Hi, nice meet you";

    io::stdin()
        .read_line(&mut name)
        .expect("Failed reading line!");

    println!("{} {}", greeting, name);
}
