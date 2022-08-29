// Enums give you a way of saying a value is on of possible values.
enum IpAddrKind {
    V4(u8, u8, u8, u8),
    V6(String),
}

fn main() {
    // Note that the variants of the enum are namespaced under its identifier, and we use a double colon to separate the two.
    let four = IpAddrKind::V4(127, 0, 0, 1);
    let six = IpAddrKind::V6(String::from("::1"));

    enum Message {
        Quit,
        Move { x: i32, y: i32  },
        Write(String),
        ChangeColor(i32, i32, i32),
    }

    let m = Message::Write(String::from("hello"));


    // There is one more similarity between enums and structs: just as we're able to define methods on
    // structs using `impl`, we're also able define methods on enums.
    impl Message {
        fn call(&self) {
            println!("called");
        }
    }

    m.call();

    // The Option Enum and Its Advantages Over Null Value.
        // The `Option` enum witch is another enum define by the standard library.
        // The `Option` type encodes the very common scenario in which a value could be something or it could be nothing.
        let some_number = Option::Some(6);
        println!("{:?}", some_number);

        // The `Option<T>` enum is so useful that it's even included in the prelude; you dont need
        // to bring it into scope explicitly.
        // Its variants are also included in the prelude: you can use `Some` and `None` directly
        // without the `Option::` prefix.
        let no_number: Option<i32> = None;
        println!("{:?}", no_number);
}


