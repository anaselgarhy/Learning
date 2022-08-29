fn main() {
    let s1 = String::from("Hello");

    // The `&s1` syntax lets us create a  refrence that refers to the value of `s1` but not own it.
    // Because it dose not own it, the value it points to will be dropped when the refrence stops begin used.
    let len = calculate_length(&s1);

    println!("The length of '{}' is {}", s1, len);

    // let s = String::from("hello");
    // Just as variables are immutable by default, so are refrence. We're not allowed to modify something we have refrence to.
    // change(&s);

    let mut s = String::from("Hi");
    change(&mut s);
    println!("s: {}", s);


    // Mutable refrence have one big restiction: if you have a mutable refrence to a value, you can have no other refrences to that value.
    let mut s = String::from("fd");

    let r1 = &mut s; // r1 refrence to s 
    // let r2 = &mut s; // not valid
    println!("r1 = {}", r1); // after use refrence are dropped.
    // So we can make anothor refrence now
    let r2 = &mut s; // valid.

    // As always, we can use curly brackets to create a new scope, allowing for multiple mutable refrences.

    let mut str = String::from("Anas");

    {
        let r1 = &mut str; // valid.
    } // r1 goes out of scope here, so we can make a new refrence with no problems.
    let r2 = &mut str; // valid also.
}

// This function takes a refrence to string.
fn calculate_length(str: &String) -> usize {
    str.len()
}

// fn change(s: &String) {
//     s.push_str(" anas"); // Error: s is immutable
// }

fn change(s: &mut String) {
    s.push_str(" Anas");
}
