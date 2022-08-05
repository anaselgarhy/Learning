fn main() {
    let r = sum(54, 54);
    println!("r = {}", r);
    print_it(r);

    let r = sum(65.76655, 43.76);
    print_it(r);
}

fn print_it<T: std::fmt::Display>(e: T) {
    println!("{}", e);
}

fn sum<T: std::ops::Add<Output = T>>(a: T, b: T) -> T {
    a + b
}
