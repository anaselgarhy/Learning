use std::slice;

fn main() {
    // String slice
    let s = "Hello, world!";

    let hello = &s[0..5]; // Hello
    let world = &s[6..11]; // world!
    println!("{} {}", hello, world);

    // With rust's `..` range syntax, if you want to start at index zero, you can drop the value
    // before the to periods. in other words, thes are equal:
    let s = String::from("hello");
    let slice = &s[0..2];
    println!("{}", slice);
    let slice = &s[..2];
    println!("{}", slice);

    // By the same token, if your slice includes the last byte of the String, you can drop the
    // trailing number. That means thes are equal:
    let s = String::from("hello");
    let length = s.len();
    let slice = &s[0..length];
    println!("{}", slice);
    let slice = &s[0..];
    println!("{}", slice);

    let s = String::from("Hi im anas yoo");
    let s = first_word(&s);
    println!("{}", s);

    // String Literals are slices
    let s = "hello, world";
    // The type of s hers is `&str`: it's a slice pointing to that specific point of the binary.
    // This is also why string literals are imutable. `&str` is an imutable reference.
    
    // String slices as parameters
    let s = String::from("hello world");
    let word = f_word(&s[0..6]);
    println!("{}", word);
    let word = f_word(&s[..]);
    println!("{}", word);
    let word = first_word(&s);
    println!("{}", word);

    let my_string_literal = "hello world";

    let word = f_word(&my_string_literal[0..6]);
    println!("{}", word);
    let word = f_word(&my_string_literal[..]);
    println!("{}", word);

    let str = my_string_literal.to_string();
    let word = first_word(&str);
    println!("{}", word);

    // Other slices
    // String slices, as you might imagine, are specific to strings only. But there's a more genral
    // slice type, too.
    let a = [1, 2, 3, 4, 5];
    let slice = &a[1..3];
    println!("{:?}", slice);
    // This slice has the type `&[i32]`. It works same way as string slices do, by storing a
    // reference to the first element and the length.
    // You will use this kind of slice for all sorts of other collections.
}

fn first_word(s: &String) -> &str {
    let bytes = s.as_bytes();

    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' { // b' ' is the byte representation of ' '
            return &s[..i];
        }
    }
    &s[..]
}

fn f_word(s: &str) -> &str {
    let bytes = s.as_bytes();

    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' {
            return &s[..i];
        }
    }
    &s[..]
}
