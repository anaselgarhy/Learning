fn main() {
    // Arrays
    // Rust arrays are fixed size, meaning that they can't grow or shrink.
    // To define the array you will use brackets []
    // If you need to define the empty array, you can use the following syntax:
    let empty_array: [i32; 5]; // This is an array of 5 integers, with all values set to 0.

    // To define a non-empty array, you can use the following syntax:
    let array = [1, 2, 3, 4, 5];

    // To access an element in an array, you can use the following syntax:
    println!("The third element of the array is: {}", array[2]); // The third element of the array is: 3

    // if you try to access out of bounds index in the run time, the program will panic(crash).

    // Tuples
    // Tuples are a group of values, separated by commas.
    // Tuples are used to return multiple values from a function.
    // Tuples are fixed size, meaning that they can't grow or shrink.
    // Tuple can be store different types of data.
    // To define a tuple, you can use the following syntax:
    let tuple = (1, "hello", 6.8);
    // or
    let tuple: (u8, &str, f32, char) = (1, "hello", 6.8, 'c');

    // To access an element in a tuple, you can use the following syntax:
    println!("The third element of the tuple is: {}", tuple.2); // The third element of the tuple is: 6.8

    println!("Them first element of the tuple is: {}", tuple.0); // Them first element of the tuple is: 1
}