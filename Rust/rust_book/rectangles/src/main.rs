#[derive(Debug)]
struct Rectangle {
    width: u32,
    height: u32,
}

fn main() {
    let rect = Rectangle {
        width: 54,
        height: 34,
    };

    println!("{:?}", rect);
    println!("{:#?}", rect);

    println!(
        "The area of the rectangle is {} square pixels.",
        area(&rect)
    );

    // Anothor way to print out a value using the `Debug` format is use the `dbg!` macro.
    // wich takes ownership of an expression and prints it out using the `Debug` format.
    dbg!(rect);

    // We can put the `dbg!` macro in expressions.
    let scale = 2;
    let rect = Rectangle {
        width: dbg!(32 * scale),
        height: 65,
    };
    dbg!(&rect);

    let rect = Rectangle {
        width: 65,
        height: 45,
    };
    println!("Tha area is {}", rect.area());


    let rect1 = Rectangle {
        width: 30,
        height: 50,
    };
    let rect2 = Rectangle {
        width: 10,
        height: 40,
    };
    let rect3 = Rectangle {
        width: 60,
        height: 45,
    };

    println!("Can rect1 hold rect2? {}", rect1.can_hold(&rect2));
    println!("Can rect1 hold rect3? {}", rect1.can_hold(&rect3));
}

fn area(rectangle: &Rectangle) -> u32 {
    rectangle.width * rectangle.height
}

// Method Syntax
    // Methods are similar to functions: we declare them with the `fn` keyword and a name,
    // thay can have parameters and return value, and thay contain code.
    // Unlike functions, Methods are defined within the context of a struct(or an enum or a trait object)
    // and their first parameter is always `self`, which is a represents the instance of the struct the method is being called on.

impl Rectangle {
    // method 
    // The `&self` is actually short for `self: &Self`
    // Within an `impl` block, the type `Self` is an alias for the type that the `impl` block is for.
    // Methods must have a parameter named `self` of type `Self` for their first parameter, so Rust lets you abbreviate this with only the name `self` in first parameter spot.
        // We've chosen `&self` here for the same reason we used `&Rectangle` in the function version. 
        // We don't want to take ownership, and we just want to read the data in the struct, not write to it.
        // If wanted to change the instance that we've called the method on as part of what the
        // method does, we'd use `&mut self` as the first parameter.
    fn area(&self) -> u32 {
        self.width * self.height
    }

    // Methods with More Parameters
    fn can_hold(&self, other: &Rectangle) -> bool {
        self.width >= other.width && self.height >= other.height
    }

    //Associated Functions
        //All functions defined within an `impl` block are called associated functions because thay're
        //associated with the type named after the `impl`. 
        //We can define associated functions that don't have `self` as their first parameter
        //(and thusare not methods) because thay don't need an instance of type to work with.
    fn square(size: u32) -> Self {
        Rectangle {
            width: size,
            height: size,
        }
    }

    // Associated functions that aren't methods are often used fore constructors that will return a new instance of struct.
    // These are often called `new`, but `new` isn't a special name and isn't built into the language. but is a common convention.
    fn new(width: u32, height: u32) -> Self {
        Rectangle {
            width,
            height,
            
        }
    }
}

// Multiple impl Blocks
    // Each struct is allowed to have multiple `impl` Blocks
    // This is useful when we want to implement the same trait for multiple types.
    // or one block for methods and other for associated functions.
impl Rectangle {
    fn e(size: u32) -> Self {
        Rectangle {
            width: size,
            height: size,
        }
    }
}
