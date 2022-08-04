fn main() {
    // `loop` is a keyword that is used to create a loop.
    // It is used to loop through a block of code forever, or until it is stopped or program is exited.

    loop {
        println!("I loop forever!");
        break; // `break` is used to stop the loop.
    }

    // `while` is used to loop through a block of code while a condition is true.

    let mut num = 5;
    while num != 0 {
        println!("Num: {}!", num);
        num -= 1;
    }

    // `for` is best used for iterating over a collection.
    let arr = [1, 2, 76, 54, 3];

    for i in arr.iter() {
        println!("i = {}", i);
    }

    // Loops can be return values using `break` keyword.
    let mut i = 1;
    let n = loop {
        i *= 2;

        if i >= 10 {
            break i; // stop looping and return `i`
        }
    };
    // `assert_eq` is used to check if two values are equal, if not it will panic (used for testing).
    // assert_eq!(n, 17);
    println!("The value of n is: {}", n);

    // for loop with `range`
    for i in 1..10 { // loop from 1 to 9
        println!("{}", i);
    }
}