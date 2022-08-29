fn main() {
    // The `loop` keyword tells Rust to execute a block of code over and over agin forever or until you explicitlyy stop.

   // loop {
   //     println!("agin!");
   // }

    // Rust provides a way to break out of a loop using code.
    // You can place the `break` keyword within the loop to tell the program when to stop executing the loop.

    let mut count = 0;
    'counting_up: loop {
        println!("count = {}", count);

        let mut rem = 10;
        loop {
            println!("remaining = {}", rem);
            if rem == 9 {
                break;
            }

            if count == 2 {
                break 'counting_up;
            }

            rem -= 1;
        }
        count += 1;
    }
    println!("End count = {}", count);


    /// Returning values from loops
    // One of the uses of a `loop` is to retry an operation you know might fill, such as checking .....

    let mut counter = 0;

    let result_of_loop = loop {
        counter += 1;

        if counter == 10 {
            break counter * 2; // Break the loop and return counter * 2
        }
    };

    println!("\nThe result of loop is: {}", result_of_loop);


    /// Conditional loops with while
    let mut number = 3;

    while number != 0 {
        println!("{}!", number);

        number -= 1;
    }
    println!("LIFTOFF while !!");

    /// Looping Through a Collection with for
    
    // You can choose to use the `while` constuct to loop over the elements of a collection, such as an array.
    let arr = [10, 20, 30, 40, 50];
    
    println!("\n--- Print all elements in array use while loop ---");
    let mut index = 0;

    while index < 5 {
        println!("the value is: {}", arr[index]);

        index += 1;
    }

    // However, this approach is error prone; we could cause the program to panic if the index value or test condition are incorrect. For example, if you changed the definition of the a array to have four elements but forgot to update the condition to while index < 4, the code would panic. It’s also slow, because the compiler adds runtime code to perform the conditional check of whether the index is within the bounds of the array on every iteration through the loop.

    // As a more concis alternative, you can use a `for` loop and execute some code for each item in a collection.
    println!("\n--- Print all elements in array use for loop ---");
    let a = [1, 2, 3, 4, 5];

    for element in a {
        println!("the vale is: {}", element);
    }


    // use for loop with Range
    for n in (1..3).rev() {
        println!("n = {}", n);
    } 
    println!("LIFTOFF!!!");
}
