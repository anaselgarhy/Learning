// Rust is a statically typed language.
// Rust requires manual specification of type to parse a value.
fn main() {
    // requires specific type to parse a value, otherwise it will be inferred.
    let guess: u32 = "42"
        .parse()
        .expect("Invalid number!");
    println!("guess = {}", guess);

    // Rust has four scalar types:
    // Integers, floating point numbers, Booleans, characters.
    
    // integer has a 12 type:
    // u - unsigned meaning positive or zero only.
    // i - signed meaning positive or negative.
    // u8, i8 - 8 bit numbers.
    // u16, i16 - 16 bit numbers.
    // u32, i32 - 32 bit numbers.
    // u64, i64 - 64 bit numbers.
    // u128, i128 - 128 bit numbers.
    // isize, usize - size of the architecture, 32 or 64 bit.
    // Each signed variant can store numbers from -(2^(n - 1)) to 2^(n - 1) - 1 inclusive, where n is the number of bits that variant uses. So an i8 can store numbers from -(2^7) to 2^7 - 1, which equals -128 to 127.
    // Unsigned variants can store numbers from 0 to 2^n - 1, so a u8 can store numbers from 0 to 2^8 - 1, which equals 0 to 255.
    // The default integer type is i32.

    let int_u8: u8 = 42;
    let int_i8 = -65i8; // we can specify the type after the value.
    let int_u16 = 89u16;
    let int_i16: i16 = -165;
    let int_u32 = 4_294_967_295u32; // _ is used to separate digits. 
    let int_i32: i32 = -2_147_483_648;
    let int_u64 = 4_294_967_295_u64;
    let int_i64: i64 = -4_294_967_295;
    let int_u128 = 4_294_967_295_u128;
    let int_i128: i128 = -4_294_967_295;
    let int_isize: isize = 5_87_76;
    let int_usize = 657_88_isize;

    println!("{}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}",
             int_u8, int_i8, int_u16, int_i16, int_u32, int_i32, int_u64, int_i64, int_u128, int_i128, int_isize, int_usize);

    // Integer literals in Rust
    let decimal = 98_222; // Decimal literal.
    let hex = 0xff; // Hexadecimal literal, prefix 0x.
    let octal = 0o77; // Octal literal, prefix 0o.
    let bin = 0b1111_0000; // Binary literal, prefix 0b.
    let byte = b'A'; // Byte literal, prefix b'
    
    println!("\ndecimal = {}, hex = {}, octal = {}, bin = {}, byte = {}",
             decimal, hex, octal, bin, byte);

    // Floating point types:
    // Rust has two floating point types: f32 and f64.
    // The default floating point type is f64.

    let x = 2.0; // f64
    let y: f32 = 3.0; // f32

    println!("\nx = {}, y = {}", x, y);

    // Boolean types:
    // Boolean types are either true or false.
    // Boolean type are one byte in size.
    
    let t = true;
    // let f = false_bool; // error cannnot use this pattern with boolean.
    let f: bool = false;

    println!("\nt = {}, f = {}", t, f);

    // Character type:
    // Character type is a single character.
    // Character type takes four bytes, because it is supported by UTF-8.
    // char keyword is used to define a character type.
    
    let c = 'z';
    let z: char = 'ℤ'; // z is a character literal, but ℤ is a character literal with a mathematical symbol.
    let geek = '🤓';

    println!("\nc = {}, z = {}, geek = {}", c, z, geek);

}
