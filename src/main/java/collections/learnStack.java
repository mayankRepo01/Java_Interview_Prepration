package collections;
import java.util.*;

public class learnStack {

	public static void main(String[] args) {
	Stack<String> s=new Stack<String>();
	s.push("Lion");
	s.push("Bear");
	s.push("cat");
	
	System.out.println(s.peek());
	s.pop();
	System.out.println(s.peek());

	}

}
