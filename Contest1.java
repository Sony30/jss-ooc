import java.util.ArrayList;
import java.util.List;

public class Contest1 {

	public static List<String> splitString(String str, char esc) {
		List<String> finalStr = new ArrayList<String>();

		// Your Logic goes here

		String current = "";
		for(char ch: str.toCharArray()) {
			if(ch == esc) {
				finalStr.add(current);
				current = "";
				continue;
			}
			current += ch;
		}

		if(!(current.equals(""))) {
			finalStr.add(current);
		}

		return finalStr;
	}

	public static void main(String[] args) {
		String str = "My name is 'Ashok Kumar Gowda' I have 12+ years of experience I work for 'IBM India Pvt Ltd' ";

		List<String> result = splitString(str, '\'');

		for (String a : result) {
			System.out.println(a);
		}
	}
}
