// Rust Sample for Something Theme

/// A simple struct to hold some data.
#[derive(Debug)]
struct Sample<'a> {
    id: u32,
    name: &'a str,
}

enum Message {
    Quit,
    Write(String),
}

macro_rules! say_hello {
    () => {
        println!("Hello from a macro!");
    };
}

fn main() {
    let sample = Sample { id: 1, name: "Something" };
    println!("Sample struct: {:?}", sample);

    let msg = Message::Write(String::from("Test message"));

    say_hello!();
}