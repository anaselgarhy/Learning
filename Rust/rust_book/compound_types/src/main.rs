// Compound types can grup multiple values into one type,  Rust has tow primaitve compound types:
// 1. Tuple: A tuple is a fixed length list of values of different types.
// 2. Array: An array is a fixed length list of values of the same type.
fn main() {
    // Tuple
    // A tuple is a general way of grouping together a number of values of different types.
    // Tuples have a  fexed length, and each element has a specific type.

    let tup: (i32, f32, u8) = (500, 6.4, 1);

    println!("The value of tup is: {:?}", tup); // {:?} is a special syntax for printing a tuple.

    let tup_2 = (500, 6.4, 1);
    let (x, y, z) = tup_2; // x = 500, y = 6.4, z = 1
    
    println!("The value of x is: {}", x);
    println!("The value of y is: {}", y);
    println!("The value of z is: {}", z);

    // We can also access a tupleelement directly by using a period (.) follwed by the index of the
    // value we want to access.

    let tup_3: (i32, f64, u8) = (655, 64.6, 2);
    let llolo = tup_3.0; // llolo = 655, indexes start at 0.
    let tow = tup_3.2; // tow = 2

    println!("The value of llolo is: {}", llolo);
    println!("The value of tow is: {}", tow);
    
    // array
    // An array is a fixed length list of values of the same type.
    // We weite the values in an array as a comma-separated list inside square brackets

    let arr = [1, 2, 3, 4, 5]; // array of 5 elements of type i32

    println!("\nThe value of arr is: {:?}", arr); // {:?} is a special syntax for print the elements in array

    let months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

    let a: [i8; 5] = [1, 2, 3, 4, 5]; // array of 5 elements of type i8

    let arr_same = [4; 5]; // array of 5 elements of type i32 with value 4 for all element
    println!("\nThe value of arr_same is: {:?}", arr_same);

    println!("The first element of array a is: {}", a[0]); // a[0] =1

}

