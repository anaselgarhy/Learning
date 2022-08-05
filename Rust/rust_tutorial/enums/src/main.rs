fn main() {
    enum Day {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday,
    }

    impl Day {
        fn is_weekend(&self) -> bool {
            match self {
                Day::Saturday | Day::Friday => true,
                _ => false
            }
        }
    }

    let day = Day::Monday;
    println!("Is day a weekend? {}", day.is_weekend());
}
