fn main() {
    // Integer types
    // The default integer type is i32.
    let _ui: u8 = 123; // unsigned 8 bit integer (0 to 255)
    let _i: i8 = -123; // signed 8 bit integer (-128 to 127)
    let _ui16: u16 = 12345; // unsigned 16 bit integer (0 to 65535)
    let _i16: i16 = -12345; // signed 16 bit integer (-32768 to 32767)
    let _ui32: u32 = 123456789; // unsigned 32 bit integer (0 to 4294967295)
    let _i32: i32 = -123456789; // signed 32 bit integer (-2147483648 to 2147483647)
    let _ui64: u64 = 1234567890123456789; // unsigned 64 bit integer (0 to 18446744073709551615)
    // we can use `_` to simplify the long numbers
    let _ui64: u64 = 123_456_789_012_3456_789; // unsigned 64 bit integer (0 to 18446744073709551615)
    let _i64: i64 = -123_456_789_012_3456_789; // signed 64 bit integer (-9223372036854775808 to 9223372036854775807)

    // Floating point types
    // The default floating point type is f64.
    let _f32: f32 = 123.456; // 32 bit floating point number (approximately 1.23456e-38 to 3.402823e+38)
    let _f64: f64 = 123.456; // 64 bit floating point number (approximately 1.23456e-308 to 1.7976931348623157e+308)

    // we can specify the type of a variable in the declaration
    let _lol = 76u8; // u8 is an unsigned 8 bit integer (0 to 255)

    // Char type
    // The size of a char is 4 bytes.
    let _c: char = 'a'; // a single character
    let _c2: char = '💩'; // a single character

    // Boolean type
    let _b: bool = true; // a boolean (true or false)

}