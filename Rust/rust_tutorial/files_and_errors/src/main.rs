use std::fs::File;
use std::io::{Write, BufWriter, BufReader, BufRead, ErrorKind};

fn main() {
    let file = File::create("out.txt");

    let mut buf_writer = match file {
        Ok(file) => BufWriter::new(file),
        Err(e) => panic!("eyo {}", e),
    };

    for i in 1..=10 {
        buf_writer.write(format!("line {}\n", i).as_bytes()).expect("write error");
    }
    buf_writer.flush().expect("flush error");

    println!("write done!");
    println!("read start!");

    let file = File::open("out.txt").expect("file open error");
    let buf_reader = BufReader::new(file);

    for line in buf_reader.lines() {
        println!("{}", line.unwrap());
    }

    let out_2 = match File::open("out2.txt") {
        Ok(file) => file,
        Err(error) => match error.kind() {
            ErrorKind::NotFound => match File::create("out2.txt") {
                Ok(file) => file,
                Err(e) => panic!("{}", e),
            },
            ErrorKind::PermissionDenied => panic!("permission denied"),
            other_error => panic!("error: {:?}", other_error),
        }
    };
}
