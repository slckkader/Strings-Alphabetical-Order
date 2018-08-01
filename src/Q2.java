import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first name :");
		Scanner input = new Scanner(System.in);
		String a = input.next();
		System.out.print("Enter the second name :");
		String b = input.next();
		System.out.print("Enter the third name :");
		String c = input.next();
		List<String> stringList = new ArrayList<>();
		stringList.add(a);
		stringList.add(b);
		stringList.add(c);

		Collections.sort(stringList);
		System.out.println("The names in alphabetical order: " + stringList);

	}

}
