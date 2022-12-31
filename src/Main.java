import java.util.Scanner;

/*
 *@Author Emircan Aktas - 31.Dec.2022
 */
public class Main {
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Enter a Number :");
        n = inp.nextInt();
        if (isPrime(n, 2)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}