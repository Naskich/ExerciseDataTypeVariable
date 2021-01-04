
/*4.	Refactoring: Prime Checker
You are given a program that checks if numbers in a given range [2...N]
 are prime. For each number is printed "{number} -> {true or false}".
  The code however, is not very well written. Your job is to modify 
  it in a way that is easy to read and understand.
Code
Sample Code
Scanner chetec = new Scanner(System.in);

int ___Do___ = Integer.parseInt(chetec.nextLine());
for (int takoa = 2; takoa <= ___Do___; takoa++) {
    boolean takovalie = true;
    for (int cepitel = 2; cepitel < takoa; cepitel++) {
        if (takoa % cepitel == 0) {
            takovalie = false;
            break;
        }
    }
    System.out.printf("%d -> %b%n", takoa, takovalie);
}
Examples
Input	Output
5	2 -> true
3 -> true
4 -> false
5 -> true
 * */
import java.util.Scanner;
public class PrimeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());		
		for (int i = 2; i <= number; i++) {	
			boolean takovalie = true;
		    for (int f = 2; f < i; f++) {
		        if (i % f == 0) {
		            takovalie = false;
		            break;
		        }
		    }
	     System.out.printf("%d -> %b%n", i, takovalie);
		}
	}
}
