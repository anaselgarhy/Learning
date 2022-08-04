fn main() {
    // Enums are custom type that list all possible variants of a type.
    // Enums is a common feature in cross-language programming.
    //

    let my_fav_color = Color::Blue;

    let direction = Direction::Up(String::from("Up"));
    let direction_2 = Direction::Down(String::from("Down"), 5);

    let click = WebEvent::Click { x: 10, y: 20 };

    let a = Some(7i8);
}

enum Color {
    Red,
    Green,
    Blue,
}

enum Direction {
    Up(String),
    Down(String, i32),
    Left,
    Right,
}

// Enums can be include structs.
enum WebEvent {
    PageLoad,
    PageUnload,
    KeyPress(char),
    Paste(String),
    Click { x: i32, y: i32 },
}

// Option<T> is a type that can be either Some(T) or None.
enum Option<T> {
    Some(T),
    None
}