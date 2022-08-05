fn print_hii() {
    println!("Hi :D");
}

fn main() {
    print_hii();
    sum_and_print(5, 5);

    println!("{}", sum_and_return(65, 76));

    let (num_1, num2) = add_one(53, 75);

    println!("{}", num_1);
    println!("{}", num2);

    let vetor = vec![54, 53, 6, 32, 32];

    println!("{:?}", sum_list(&vetor));

    println!("{:?}", vetor);
}

fn sum_and_print(num_1: i32, num_2: i32) {
    println!("{} + {} = {}", num_1, num_2, num_1 + num_2);
}

fn sum_and_return(num_1: i32, num_2: i32) -> i32 {
    num_1 + num_2
}


fn add_one(x: i32, y: i32) -> (i32, i32) {
    (x + 1, y + 1)
}


fn sum_list(list: &[i32]) -> i32 {
    let mut sum = 0;
    for num in list {
        sum += num;
    }
    return sum;
}
