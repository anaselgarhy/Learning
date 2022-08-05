use std::cmp::Ordering;

fn main() {
    let age = 19;
    let vote_age = 18;

    match age.cmp(&vote_age) {
        Ordering::Greater | Ordering::Equal => println!("You can vote."),
        Ordering::Less => println!("You can't vote."),
    }
}
