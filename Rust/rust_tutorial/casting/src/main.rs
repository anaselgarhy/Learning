fn main() {
    let x: u8 = 100;

    let y: i32 = x as i32; // cast x from u8 to i32
                           // this is a lossy conversion
    
    println!("{}", y);
}
