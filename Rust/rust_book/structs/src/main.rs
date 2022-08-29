// Structs are similar to tuples, in that both hold multiple related values.
// Like tuples, the pieces of struct can be different types.
// Unlike with tuples, in struct you'll name each piece of data, so it's clear what the values mean.

#[derive(Debug)]
struct User {
    active: bool,
    username: String,
    email: String,
    sign_in_count: u64,
}


fn main() {
    let mut user1 = User {
        email: String::from("anas.elgarhy.dev@gmail.com"),
        username: String::from("anas-elgarhy"),
        active: true, // the order of fields is not important
        sign_in_count: 5,
    };

    println!("user1 name: {}", user1.username);
    user1.username = "anas".to_string();
    println!("user1 name: {}", user1.username);

    let user2 = build_user(String::from("user2@email.com"),
        String::from("yoo"));
    println!("user2: {:#?}", user2);

    // Creating instances from other instances with struct update synatx
    // It's often useful to create a new instance of a struct that includes most of the values from
    // another instance, but changes some. You can do this using the struct update synatx
    let user3 = User {
        email: String::from("oh@mail.oh"),
        ..user2
    };
    println!("user3: {:#?}", user3);
    // Note: we can't use user2 after this because it's moved
    // because the String in username field of user1 was moved to user3
    // If we had given user3 new String in the username field of user2 
    // this behavior would because The String not implemented the Copy trait

    // Using tuple structs without named fields to create different types.
    // Rust also supports structs that look similar to tuples, called `tuple structs`.
    // Tuple structs have the added meaning the struct name provides but don't have names associated with each fields.
    // rather, they just have the types of fields.
    // Tuple structs are useful when you want to give the whole tuple a name and make the tuple a ddifferent type from other tuples.
    
    #[derive(Debug)] // this for debug printing ({:#?})
    struct Color(i16, i16, i16); // yes, we can define a structs in the functions
    #[derive(Debug)]
    struct Point(i32, i32, i32);

    let yellow = Color(255, 255, 0);
    println!("yellow: {:#?}", yellow);
    let p = Point(765, 65, 46);
    println!("p: {:#?}", p);
    // We can use a `.` to access the fields of a tuple struct
    println!("p.x: {}", p.0);

    // Unit-Like Structs Without Any Fields
    // You can also structs thatb don't have any fields, but have a name
    // These are called unit-like structs because they behave similaly to `()`.
    // Unit-Like structs can be useful when you need to implement a trait on some type but dont
    // have data that you want to store in the type it self.
    struct AlwaysEqual;
    let a = AlwaysEqual;

}

fn build_user(email: String, username: String) -> User {
    User {
        email,
        username,
        active: true,
        sign_in_count: 1,
    }
}
