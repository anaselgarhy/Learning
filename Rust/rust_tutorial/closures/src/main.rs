fn main() {
    let sum = |num_1: i32, num_2: i32| -> i32 { num_1 + num_2 };

    println!("2 + 3 = {}", sum(2, 3));

    let mut n = 5;

    let mut inc_num = || n += 1;

    inc_num();
    println!("n = {}", n);

    exc_fun(3, 5, sum);

    let mult = |n, b| n * b;
    println!("3 * 5 = {}", mult(3, 5));
}

fn exc_fun<T>(p1: i32, p2: i32, f: T) -> ()
where
    T: Fn(i32, i32) -> i32,
{
    println!("{}", f(p1, p2));
}
