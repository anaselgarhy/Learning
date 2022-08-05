use std::thread;
use std::sync::{Arc, Mutex};

fn main() {
    let bank = Arc::new(Mutex::new(Bank {
        balance: 987.0,
    }));

    // create a threads that will access the bank
    let threads = (0..10).map(|_| {
        let bank = bank.clone();
        thread::spawn(move || {
            withdraw(&bank, 5.0);
        })
    });

    // wait for all threads to complete
    for thread in threads {
        thread.join().unwrap();
    }

    println!("Final balance: {}", bank.lock().unwrap().balance);
}

struct Bank {
    balance: f64,
}

fn withdraw(bank: &Arc<Mutex<Bank>>, amount: f64) {
    let mut bank = bank.lock().unwrap();
    bank.balance -= amount;
    println!("withdraw {} from {}", amount, bank.balance);
}
