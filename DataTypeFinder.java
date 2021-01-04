
/*1.	Data Type Finder
You will receive an input until you receive "END".
 Find what data type is the input. Possible data types are:
•	Integer 
•	Floating point 
•	Characters
•	Boolean
•	Strings
Print the result in the following format: "{input} is {data type} type"
Examples
Input	Output
5
2.5
true
END	5 is integer type
2.5 is floating point type
true is boolean type
a
asd
-5
END	a is character type
asd is string type
-5 is integer type
 * */
import java.util.Scanner;
public class DataTypeFinder {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String nameType = scanner.nextLine(); 	
    	while (nameType.equals("END")) {
    		Scanner input =  new Scanner(nameType);
    		if (input.hasNextBoolean()) {
				System.out.printf("%s is boolean type%n",nameType);
			} else if (input.hasNextInt()) {
				System.out.printf("%s is Integer type%n",nameType);
			}else if (nameType.length()==1) {
				System.out.printf("%s is character type%n",nameType);
			} else if (input.hasNextFloat()) {
				System.out.printf("%s is floating point type%n",nameType);
			} else if (input.hasNextLine()) {
				System.out.printf("%s is string type%n",nameType);
			}
    		nameType = scanner.nextLine();
		}
    }
}
