fn main() {
    let mut arr = [1, 2, 3, 4, 5];

    let iter = arr.iter();

    for i in iter {
        println!("{}", i);
    }

    for i in arr.iter_mut() {
        *i += 2;
    }
    
    for i in arr.into_iter() { // moves the array into the iterator arr not longer valid
        println!("{}", i);
    }
}
