use std::collections::HashSet;

fn first_duplicate(numbers: &[i32]) -> i32 {
    let mut seen = HashSet::new();
    
    for &num in numbers {
        if seen.contains(&num) {
            return num;
        }
        seen.insert(num);
    }
    
    -1
}

fn main() {
    // TEST
    assert_eq!(first_duplicate(&[1, 2, 3, 4]), -1);
    assert_eq!(first_duplicate(&[]), -1);
    assert_eq!(first_duplicate(&[6, 3, 7, 2, 7, 3, 9, 10, 1, 2, 4]), 7);
}
