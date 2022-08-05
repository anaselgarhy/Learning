fn main() {
    let rect = Rectangle::new(10, 20);
    let circle = Circle::new(10, 20);

    println!("rect area: {}", rect.area());
    println!("circle area: {}", circle.area());
}
trait Shape {
    fn new(width: u32, height: u32) -> Self;
    fn area(&self) -> u32;
}

struct Rectangle {
    width: u32,
    height: u32,
}

impl Shape for Rectangle {
    fn new(width: u32, height: u32) -> Self {
        Rectangle { width, height }
    }

    fn area(&self) -> u32 {
        self.width * self.height
    }
}

struct Circle {
    length: u32,
    height: u32,
}

impl Shape for Circle {
    fn new(length: u32, height: u32) -> Self {
        Circle { length, height }
    }

    fn area(&self) -> u32 {
        (self.length / 2).pow(2) * std::f64::consts::PI as u32
    }
}
