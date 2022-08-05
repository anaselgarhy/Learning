fn main() {
    let vec1: Vec<u8> = Vec::new(); // vec1 is an empty vector
    let mut vec2 = vec![1, 2, 3]; // vec2 is a vector with three elements

    vec2.push(4); // we can push elements onto the end of a vector
    println!("{:?}", vec2);

    println!("{}", vec2.pop().unwrap()); // we can pop elements from the end of a vector
    
    println!("vec2 length: {}", vec2.len()); // we can check the length of a vector
}
