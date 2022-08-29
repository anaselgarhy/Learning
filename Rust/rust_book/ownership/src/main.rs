fn main() {
    // Ownership rules.
    // Each value in Rust has an owner.
    // There can only be one owner at a time.
    // When the owner goes out of scope, the value will be dropped.


    //  Variable scope
    let s = "hello";

    {                     // a is not valid here, it's not yet declared
        let a = "hello";  // a is valid from this point forward

        // do stuff with a
    } // this scope is now over, and a in no longer valid.

    // The string type
    // You can create a String from a string literal using the from function

    let s = String::from("Hello");

    let mut s = String::from("hello");

    s.push_str(", world!"); // push_str() appends a literal to a String

    println!("{}", s); // print 'hello, world!'

    // Memory and allocation.
    /*
       In the case of a string literal, 
       we know the contents at compile time, so the text is hardcoded directly into the final executable. 
       This is why string literals are fast and efficient.
       But these properties only come from the string literal's immutability.
       */
    // In Rust the memory is automativlly returned(free) once the varible that owns it goes out of scope.

    let str = String::from("Anas");
    let n = str; // str not valid after this line.

    // println!("{}", str); // Error: value borrowed here after move
    println!("{}", n);

    // If you really want clone use clone function.
    let s1 = String::from("Hi");
    let s2 = s1.clone();

    println!("s1 = {}, s2 = {}", s1, s2);

    let s = String::from("Hello"); // s come into scope
    takes_ownership(s); // s's value moves into the function...
                        // ... and so is no longer valid here.

    let g = String::from("hhhh");
    let g = takes_and_gives_back(g); 
    // g is still valid here.

    println!("{}", g);

    let name = String::from("Anas Elgarhy");
    let (s, len) = calculate_length(name);

    println!("The length of '{}' is {}.", s, len);
}

fn takes_ownership(str: String) { // str come into scope.
    println!("{}", str);
} // Here, str goes out of scope and `drop` is called. The backing memory is freed.

fn takes_and_gives_back(str: String) -> String {
    println!("{}", str);
    str // gives back.
}

fn calculate_length(str: String) -> (String, usize) {
    let length = str.len();

    (str, length)
}
