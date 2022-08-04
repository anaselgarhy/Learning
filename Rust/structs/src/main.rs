fn main() {
    // Struct is a collection of data fields.
    // Structs are always created with `struct` keyword.

    // Structs in rust has a thee flavors:
    // 1. classic structs
    // 2. tuple structs
    // 3. unit structs

    // 1. classic structs
    // Most common structs in rust.
    // Each field has an name and a type.

    let car_1 = Car {
        make: String::from("Ford"),
        model: String::from("Mustang"),
        year: 2022,
    };
    println!("car make: {}, car model: {}, car year: {}", car_1.make,
        car_1.model, car_1.year);

    // We can destructure the struct to get the values.
    let Car { make, model, year } = car_1;
    println!("car make: {}, car model: {}, car year: {}", make, model, year);

    // 2. tuple structs
    // Similar to classic structs, but each field have no names
    let origin = Point2d(37, 75);
    // To access the fields in a tuple struct, use the index operator.
    println!("x: {}, y: {}", origin.0, origin.1);
    // You can destructure a tuple struct into multiple variables.
    let Point2d(x, y) = origin;
    println!("x: {}, y: {}", x, y);

    // 3. unit structs
    // Have no fields
    // Similar to the () unit type
}

// Classic structs
struct Car {
    make: String,
    model: String,
    year: i32,
}

// Tuple structs
struct Point2d(i32, i32);