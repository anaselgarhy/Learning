use std::thread;
use std::time::Duration;

fn main() {
    let my_thread = thread::spawn(|| {
        for i in 1..=30 {
            println!("first thread: {}", i);
            thread::sleep(Duration::from_millis(1));
        }
    });

    for i in 0..10 {
        println!("main thread: {}", i);
        thread::sleep(Duration::from_millis(1));
    }

    // Wait for the thread to finish.
    my_thread.join().unwrap();
    
}
