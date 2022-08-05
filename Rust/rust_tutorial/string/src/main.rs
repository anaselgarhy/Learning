fn main() {
    let mut str = String::new(); // create a empty string

    str.push('A'); // push a character to the string
    str.push_str("Anas Ahmed"); // push a string to the string
    
    for s in str.split_whitespace() {
        println!("{}", s);
    }


    let str = String::from("g h t r t t u o"); // create a string with some text

    let mut my_vec: Vec<char> = str.chars().collect();

    my_vec.sort(); // sort the vector
    my_vec.dedup(); // remove duplicates

    for c in my_vec {
        print!("{}", c);
    }

    let str = "Random string"; // create a fixed string

    let byte_arr = str.as_bytes(); // convert the string to a byte array
    println!("{:?}", byte_arr);

    let str = String::from(str); // create a heap string from a fixed string
    println!("{}", str);

}
