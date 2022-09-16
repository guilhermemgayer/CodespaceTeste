use std::io::stdin;
fn main() {
    let mut n = String::new();
    let mut n2 = String::new();
    println!("Digite um número: ");
    stdin().read_line(&mut n).ok();
    println!("Digite outro número: ");
    stdin().read_line(&mut n2).ok();
    let s = n.trim().parse::<i32>().unwrap() + n2.trim().parse::<i32>().unwrap();
    println!("A soma dos números é: {}",s)
    
}
