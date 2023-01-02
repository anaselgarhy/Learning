struct Solution;

impl Solution {
    pub fn longest_string_len(str: &str) -> usize {
        let mut max_len = 0;
        let mut longest_str = String::new();

        for c in str.chars() {
            if longest_str.contains(c) {
                if longest_str.len() > max_len {
                    max_len = longest_str.len();
                }
                longest_str.clear();
            }
            longest_str.push(c);
        }

        if longest_str.len() > max_len {
            max_len = longest_str.len();
        }

        max_len
    }
}

fn main() {
    assert!(Solution::longest_string_len("abcabcbb") == 3);
    assert!(Solution::longest_string_len("bbbbb") == 1);
    assert!(Solution::longest_string_len("pwwkew") == 3);
    assert!(Solution::longest_string_len("") == 0);
    assert!(Solution::longest_string_len("asdfghjkl") == 9);
    println!("All tests passed!");
}