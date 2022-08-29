use std::io;

fn main() {
    println!("Enter the number");

    let mut num = String::new();

    io::stdin()
        .read_line(&mut num)
        .expect("Error!");

    let num: u64 = match num.trim().parse(){
        Ok(result) => result,
        Err(_) => {
            println!("Please enter a number.");
            return; // exit
        },
    };

    println!("The nth Fibonacci number: {}", fib(num));
}

fn fib(n: u64) -> u64 {
    if n == 0 {
        return 0;
    } else if n == 1 || n == 2 {
        return 1;
    }
    fib(n - 1) + fib(n - 2) // or return fib(n - 1) + fib(n - 2);
}
