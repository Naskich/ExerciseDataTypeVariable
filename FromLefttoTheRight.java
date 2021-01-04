
/*2.	From Left to The Right
You will receive a number which represents how many lines
 we will get as an input. On the next N lines, you will
  receive a string with 2 numbers separated by a single
   space. You need to compare them. If the left number
    is greater than the right number, you need to print
     the sum of all digits in the left number, otherwise 
     print the sum of all digits in the right number.
Examples
Input	Output
2
1000 2000
2000 1000	2
2
4
123456 2147483647
5000000 -500000
97766554 97766554
9999999999 8888888888	46
5
49
90
 * */
import java.util.Scanner;
public class FromLefttoTheRight {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		long fisrt = 0;
		long second = 0;
		long sum =0;	
		for (int i = 0; i <number; i++) {
			fisrt = scanner.nextLong();
			second = scanner.nextLong();	
			if (fisrt>second) {
				sum=0;
				while (fisrt!=0) {
					sum+=fisrt%10;
					fisrt/=10;
				}
				System.out.println(Math.abs(sum));
			} else {
				sum=0;
					while (second!=0) {
						sum+=second%10;
						second/=10;
					}
				System.out.println(Math.abs(sum));
			}
		} 
	}
}